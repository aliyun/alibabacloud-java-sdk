// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30002406051</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0F9F136A-1BF6-5CC1-9D57-9717761F03B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocResponseBody self = new UpdateDocResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDocResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
