// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentOutboundCallRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent configured in the <a href="https://ims.console.aliyun.com/ai/robot/list">IMS console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>*******<strong><strong>e4f309379701645f4</strong></strong></p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The callee number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>173*****533</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The caller number. Only phone numbers in the Chinese mainland are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>183*****333</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>The outbound call configuration of the AI agent.</p>
     */
    @NameInMap("Config")
    public AIAgentOutboundCallConfig config;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ImsAIAgentFreeObCall")
    public String imsAIAgentFreeObCall;

    /**
     * <p>The unique identifier of the conversation, which can be used to store, query, and synchronize chat records across multiple calls. Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>f213fbc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The user-defined message.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;city&quot;:&quot;hangzhou&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static StartAIAgentOutboundCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentOutboundCallRequest self = new StartAIAgentOutboundCallRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAgentOutboundCallRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public StartAIAgentOutboundCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public StartAIAgentOutboundCallRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public StartAIAgentOutboundCallRequest setConfig(AIAgentOutboundCallConfig config) {
        this.config = config;
        return this;
    }
    public AIAgentOutboundCallConfig getConfig() {
        return this.config;
    }

    public StartAIAgentOutboundCallRequest setImsAIAgentFreeObCall(String imsAIAgentFreeObCall) {
        this.imsAIAgentFreeObCall = imsAIAgentFreeObCall;
        return this;
    }
    public String getImsAIAgentFreeObCall() {
        return this.imsAIAgentFreeObCall;
    }

    public StartAIAgentOutboundCallRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StartAIAgentOutboundCallRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
