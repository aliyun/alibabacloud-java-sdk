// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30001905617</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <strong>example:</strong>
     * <p>07B270A4-61D8-57F6-A609-A3C216CFB872</p>
     */
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
