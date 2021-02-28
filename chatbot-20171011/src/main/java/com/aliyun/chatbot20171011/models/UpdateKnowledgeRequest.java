// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeRequest extends TeaModel {
    @NameInMap("Knowledge")
    public String knowledge;

    public static UpdateKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeRequest self = new UpdateKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

}
