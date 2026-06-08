// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AskLumaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-luma-agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>conv_1474xxx32_593b9d08-9</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxRows")
    public Integer maxRows;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Question")
    public String question;

    public static AskLumaRequest build(java.util.Map<String, ?> map) throws Exception {
        AskLumaRequest self = new AskLumaRequest();
        return TeaModel.build(map, self);
    }

    public AskLumaRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AskLumaRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public AskLumaRequest setMaxRows(Integer maxRows) {
        this.maxRows = maxRows;
        return this;
    }
    public Integer getMaxRows() {
        return this.maxRows;
    }

    public AskLumaRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

}
