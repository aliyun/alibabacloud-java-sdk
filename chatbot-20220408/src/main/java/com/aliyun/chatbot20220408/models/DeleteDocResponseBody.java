// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30002406051</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <strong>example:</strong>
     * <p>DFB71B34-4188-4EA2-9988-EF3014E75910</p>
     */
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
