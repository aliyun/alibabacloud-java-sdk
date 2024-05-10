// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSimQuestionRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SimQuestionId")
    public Long simQuestionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateSimQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSimQuestionRequest self = new UpdateSimQuestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSimQuestionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateSimQuestionRequest setSimQuestionId(Long simQuestionId) {
        this.simQuestionId = simQuestionId;
        return this;
    }
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

    public UpdateSimQuestionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
