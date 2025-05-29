// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentOutboundCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>*******<strong><strong>e4f309379701645f4</strong></strong></p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>173*****533</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>183*****333</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    @NameInMap("Config")
    public AIAgentOutboundCallConfig config;

    /**
     * <strong>example:</strong>
     * <p>f213fbc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

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
