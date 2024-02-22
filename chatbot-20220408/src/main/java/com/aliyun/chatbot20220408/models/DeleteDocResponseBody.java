// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDocResponseBody extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocResponseBody self = new DeleteDocResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDocResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DeleteDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
