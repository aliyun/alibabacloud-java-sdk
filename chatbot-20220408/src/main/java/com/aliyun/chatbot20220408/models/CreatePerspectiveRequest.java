// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePerspectiveRequest extends TeaModel {
    /**
     * <p>The key of the business space. If this parameter is not specified, the default business space is accessed. You can obtain the key from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The description of the perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>A mobile perspective for the shopping app</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the perspective. The name can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Mobile perspective</p>
     */
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
