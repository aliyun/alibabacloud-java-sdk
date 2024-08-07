// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateFaqResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30001979424</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <strong>example:</strong>
     * <p>28805A7C-D695-548C-A31B-67E52C2C274F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFaqResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFaqResponseBody self = new CreateFaqResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFaqResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateFaqResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
