// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class RetryDocResponseBody extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetryDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryDocResponseBody self = new RetryDocResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryDocResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public RetryDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
