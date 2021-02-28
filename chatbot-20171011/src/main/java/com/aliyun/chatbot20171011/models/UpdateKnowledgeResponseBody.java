// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static UpdateKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeResponseBody self = new UpdateKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKnowledgeResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
