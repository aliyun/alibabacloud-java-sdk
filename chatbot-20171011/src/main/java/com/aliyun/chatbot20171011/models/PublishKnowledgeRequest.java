// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishKnowledgeRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("Async")
    public Boolean async;

    public static PublishKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishKnowledgeRequest self = new PublishKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public PublishKnowledgeRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public PublishKnowledgeRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
