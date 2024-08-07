// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeletePerspectiveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>3001</p>
     */
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static DeletePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePerspectiveRequest self = new DeletePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public DeletePerspectiveRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeletePerspectiveRequest setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}
