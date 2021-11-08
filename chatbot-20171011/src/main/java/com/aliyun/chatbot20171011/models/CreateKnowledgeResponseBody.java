// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateKnowledgeResponseBody extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeResponseBody self = new CreateKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
