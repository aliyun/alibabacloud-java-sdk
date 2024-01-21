// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteDocumentTagRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("TagId")
    public String tagId;

    public static DeleteDocumentTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentTagRequest self = new DeleteDocumentTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentTagRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteDocumentTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
