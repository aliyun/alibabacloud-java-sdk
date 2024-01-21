// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateDocumentTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Name")
    public String name;

    @NameInMap("TagId")
    public String tagId;

    public static UpdateDocumentTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentTagRequest self = new UpdateDocumentTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateDocumentTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDocumentTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
