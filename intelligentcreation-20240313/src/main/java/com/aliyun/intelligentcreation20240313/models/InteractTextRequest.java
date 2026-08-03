// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class InteractTextRequest extends TeaModel {
    @NameInMap("agentId")
    public String agentId;

    @NameInMap("content")
    public String content;

    @NameInMap("sessionId")
    public String sessionId;

    public static InteractTextRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractTextRequest self = new InteractTextRequest();
        return TeaModel.build(map, self);
    }

    public InteractTextRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public InteractTextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public InteractTextRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
