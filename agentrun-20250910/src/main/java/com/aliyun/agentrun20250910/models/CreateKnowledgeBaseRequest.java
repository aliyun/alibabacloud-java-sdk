// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseRequest extends TeaModel {
    @NameInMap("body")
    public CreateKnowledgeBaseInput body;

    public static CreateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseRequest self = new CreateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseRequest setBody(CreateKnowledgeBaseInput body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseInput getBody() {
        return this.body;
    }

}
