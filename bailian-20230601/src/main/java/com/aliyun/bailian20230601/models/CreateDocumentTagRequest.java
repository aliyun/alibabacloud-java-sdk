// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateDocumentTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Name")
    public String name;

    public static CreateDocumentTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentTagRequest self = new CreateDocumentTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocumentTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateDocumentTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
