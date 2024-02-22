// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocResponseBody extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDocResponseBody self = new CreateDocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDocResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
