// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateKnowledgeRequest extends TeaModel {
    @NameInMap("Knowledge")
    public String knowledge;

    public static CreateKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeRequest self = new CreateKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

}
