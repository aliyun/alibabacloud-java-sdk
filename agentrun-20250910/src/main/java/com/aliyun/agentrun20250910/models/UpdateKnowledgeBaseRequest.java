// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseRequest extends TeaModel {
    @NameInMap("body")
    public UpdateKnowledgeBaseInput body;

    public static UpdateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseRequest self = new UpdateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseRequest setBody(UpdateKnowledgeBaseInput body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeBaseInput getBody() {
        return this.body;
    }

}
