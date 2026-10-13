// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique chatbot identifier (chatbot ID). Log on to the Chatbot console and navigate to Chatbot Details &gt; Session Interface to view the chatbot instance information and obtain the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The intent name in the dialog flow. If this name is specified, the chatbot directly enters this intent for Q&amp;A.</p>
     * 
     * <strong>example:</strong>
     * <p>CheckWeatherIntent</p>
     */
    @NameInMap("IntentName")
    public String intentName;

    /**
     * <p>The ID of a knowledge title in the knowledge base. If this ID is specified, the chatbot directly returns the answer for the specified knowledge title.</p>
     * 
     * <strong>example:</strong>
     * <p>30002406051</p>
     */
    @NameInMap("KnowledgeId")
    public String knowledgeId;

    /**
     * <p>The array of perspective codes, which is used to call answers from different perspectives under the same knowledge title. Example: Perspective=[&quot;FZJBY3raWr&quot;]. When using the SDK, use the parameters defined in the SDK.</p>
     */
    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    /**
     * <p>Specifies whether to use the test or production environment. Default value: false (production environment). Valid values:</p>
     * <ul>
     * <li>true: Test environment. This is for testing only. Using it in production may cause instability and QPS throttling.</li>
     * <li>false: Production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SandBox")
    public Boolean sandBox;

    /**
     * <p>The visitor ID, which identifies the user in the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>custumer_123456</p>
     */
    @NameInMap("SenderId")
    public String senderId;

    /**
     * <p>The nickname of the visitor in the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>User123456</p>
     */
    @NameInMap("SenderNick")
    public String senderNick;

    /**
     * <p>The session ID, which identifies a visitor\&quot;s session and maintains context information. For a new visitor, you do not need to pass this field when calling the Chat operation for the first time. The chatbot starts a session and returns the SessionId in the response of the Chat operation. For subsequent conversation turns of the visitor, pass the SessionId of the current session when calling the Chat operation so that the chatbot can continue the conversation based on the SessionId. Maximum length: 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>9c6ebdc6e66f46ecadab3434314f6959</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The input from the chatbot visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>How is the weather today?</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    /**
     * <p>A JSON-formatted set of user-defined parameters that can be passed to various dialog engines.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;phone&quot;:123456789}</p>
     */
    @NameInMap("VendorParam")
    public String vendorParam;

    public static ChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatRequest self = new ChatRequest();
        return TeaModel.build(map, self);
    }

    public ChatRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ChatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChatRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public ChatRequest setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public ChatRequest setPerspective(java.util.List<String> perspective) {
        this.perspective = perspective;
        return this;
    }
    public java.util.List<String> getPerspective() {
        return this.perspective;
    }

    public ChatRequest setSandBox(Boolean sandBox) {
        this.sandBox = sandBox;
        return this;
    }
    public Boolean getSandBox() {
        return this.sandBox;
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

    public ChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public ChatRequest setVendorParam(String vendorParam) {
        this.vendorParam = vendorParam;
        return this;
    }
    public String getVendorParam() {
        return this.vendorParam;
    }

}
