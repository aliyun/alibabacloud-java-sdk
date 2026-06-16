// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class AddMem0MemoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <strong>example:</strong>
     * <p>{&quot;messages&quot;:[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;我喜欢喝拿铁&quot;}],&quot;user_id&quot;:&quot;alice&quot;,&quot;metadata&quot;:{&quot;channel&quot;:&quot;app&quot;}}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static AddMem0MemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMem0MemoriesRequest self = new AddMem0MemoriesRequest();
        return TeaModel.build(map, self);
    }

    public AddMem0MemoriesRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public AddMem0MemoriesRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
