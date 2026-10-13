// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdatePerspectiveRequest extends TeaModel {
    /**
     * <p>The business space key. If not specified, the default business space is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The perspective name. The name can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Client perspective</p>
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
