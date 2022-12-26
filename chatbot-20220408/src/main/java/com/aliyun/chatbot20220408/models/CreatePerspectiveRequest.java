// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePerspectiveRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static CreatePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePerspectiveRequest self = new CreatePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public CreatePerspectiveRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreatePerspectiveRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePerspectiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
