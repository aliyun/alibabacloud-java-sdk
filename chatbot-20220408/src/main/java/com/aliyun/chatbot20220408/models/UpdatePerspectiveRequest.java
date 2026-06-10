// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdatePerspectiveRequest extends TeaModel {
    /**
     * <p>The business space key. If not specified, the default business space is used. You can get the key from the Business Management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The name of the perspective. The name must be 50 characters or fewer.</p>
     * 
     * <strong>example:</strong>
     * <p>客户端视角</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The perspective ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3001</p>
     */
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static UpdatePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePerspectiveRequest self = new UpdatePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePerspectiveRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdatePerspectiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePerspectiveRequest setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}
