// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    /**
     * <p>The agent ID used for the service. This parameter is optional. You can specify an agent generated after DAS Agent is enabled or an agent that you manually created. If this parameter is not specified, the default agent is used.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-472T0DxtmjIxxxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;68fe0321-37fe-4c75-a118-b61b33156f6a&quot;,&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello&quot;}]}</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The user interaction feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;metadata&quot;:{&quot;a2uiClientDataModel&quot;:{&quot;decided&quot;:true,&quot;interaction&quot;:{&quot;request&quot;:{&quot;allowFreeText&quot;:true,&quot;question&quot;:&quot;question?&quot;,&quot;options&quot;:[{&quot;label&quot;:&quot;162&quot;,&quot;value&quot;:&quot;162&quot;},{&quot;label&quot;:&quot;242&quot;,&quot;value&quot;:&quot;242&quot;},{&quot;label&quot;:&quot;243&quot;,&quot;value&quot;:&quot;243&quot;},{&quot;label&quot;:&quot;486&quot;,&quot;value&quot;:&quot;486&quot;}]},&quot;kind&quot;:&quot;choice&quot;,&quot;interruptId&quot;:&quot;5857955e-4856-4ab3-969e-f8b4c484bda4&quot;,&quot;status&quot;:&quot;pending&quot;},&quot;free_text&quot;:&quot;&quot;},&quot;a2uiAction&quot;:{&quot;name&quot;:&quot;das_interaction_response&quot;,&quot;context&quot;:{&quot;value&quot;:&quot;162&quot;},&quot;surfaceId&quot;:&quot;render-choice-7c03eb4f927f42ff8c30b30a2cc0797d&quot;,&quot;sourceComponentId&quot;:&quot;opts-0&quot;,&quot;timestamp&quot;:&quot;2026-09-15T06:54:15.556Z&quot;}},&quot;payload&quot;:{&quot;value&quot;:&quot;162&quot;},&quot;interruptId&quot;:&quot;5857955e-4856-4ab3-969e-f8b4c484bda4&quot;,&quot;status&quot;:&quot;resolved&quot;}]</p>
     */
    @NameInMap("Resume")
    public String resume;

    /**
     * <p>The session ID in UUID string format. This parameter is optional. If this parameter is not specified, a new session is created by default. To maintain context across conversations, use the same session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to output summary information.</p>
     * 
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

    public ChatRequest setResume(String resume) {
        this.resume = resume;
        return this;
    }
    public String getResume() {
        return this.resume;
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
