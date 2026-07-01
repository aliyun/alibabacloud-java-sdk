// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentOutboundCallShrinkRequest extends TeaModel {
    /**
     * <p>The AI agent ID configured in the <a href="https://ims.console.aliyun.com/ai/robot/list">IMS console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>*******<strong><strong>e4f309379701645f4</strong></strong></p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The called number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>173*****533</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The caller number. Only numbers from mainland China are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>183*****333</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>The AI agent outbound call configuration.</p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ImsAIAgentFreeObCall")
    public String imsAIAgentFreeObCall;

    /**
     * <p>A unique identifier for the session. You can use this ID to store, query, and synchronize chat history across multiple calls. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>f213fbc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static StartAIAgentOutboundCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentOutboundCallShrinkRequest self = new StartAIAgentOutboundCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAgentOutboundCallShrinkRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public StartAIAgentOutboundCallShrinkRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public StartAIAgentOutboundCallShrinkRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public StartAIAgentOutboundCallShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public StartAIAgentOutboundCallShrinkRequest setImsAIAgentFreeObCall(String imsAIAgentFreeObCall) {
        this.imsAIAgentFreeObCall = imsAIAgentFreeObCall;
        return this;
    }
    public String getImsAIAgentFreeObCall() {
        return this.imsAIAgentFreeObCall;
    }

    public StartAIAgentOutboundCallShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StartAIAgentOutboundCallShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
