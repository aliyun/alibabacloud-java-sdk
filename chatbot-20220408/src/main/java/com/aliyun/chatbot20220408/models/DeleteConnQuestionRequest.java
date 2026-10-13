// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteConnQuestionRequest extends TeaModel {
    /**
     * <p>The key of the workspace. If this parameter is not specified, the default workspace is accessed. You can obtain the key on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The ID of the association.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>877397683</p>
     */
    @NameInMap("OutlineId")
    public Long outlineId;

    public static DeleteConnQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnQuestionRequest self = new DeleteConnQuestionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteConnQuestionRequest setOutlineId(Long outlineId) {
        this.outlineId = outlineId;
        return this;
    }
    public Long getOutlineId() {
        return this.outlineId;
    }

}
