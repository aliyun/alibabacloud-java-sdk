// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSimQuestionRequest extends TeaModel {
    /**
     * <p>The key of the workspace. If you do not specify this parameter, the default workspace is used. You can find the key on the Business Management page of your master account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The ID of the similar question that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000002788</p>
     */
    @NameInMap("SimQuestionId")
    public Long simQuestionId;

    /**
     * <p>The new title of the similar question. The title can be up to 120 characters long.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试相似问标题</p>
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
