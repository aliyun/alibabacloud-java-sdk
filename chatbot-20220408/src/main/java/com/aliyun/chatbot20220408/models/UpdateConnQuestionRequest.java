// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateConnQuestionRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnQuestionId")
    public Long connQuestionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutlineId")
    public Long outlineId;

    public static UpdateConnQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnQuestionRequest self = new UpdateConnQuestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateConnQuestionRequest setConnQuestionId(Long connQuestionId) {
        this.connQuestionId = connQuestionId;
        return this;
    }
    public Long getConnQuestionId() {
        return this.connQuestionId;
    }

    public UpdateConnQuestionRequest setOutlineId(Long outlineId) {
        this.outlineId = outlineId;
        return this;
    }
    public Long getOutlineId() {
        return this.outlineId;
    }

}
