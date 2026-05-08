// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ag-472T0DxtmjIxxxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;68fe0321-37fe-4c75-a118-b61b33156f6a&quot;,&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello&quot;}]}</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Summary")
    public String summary;

    public static ChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatRequest self = new ChatRequest();
        return TeaModel.build(map, self);
    }

    public ChatRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ChatRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
