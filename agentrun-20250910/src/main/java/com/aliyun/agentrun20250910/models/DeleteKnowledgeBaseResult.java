// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public KnowledgeBase data;

    @NameInMap("requestId")
    public String requestId;

    public static DeleteKnowledgeBaseResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseResult self = new DeleteKnowledgeBaseResult();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteKnowledgeBaseResult setData(KnowledgeBase data) {
        this.data = data;
        return this;
    }
    public KnowledgeBase getData() {
        return this.data;
    }

    public DeleteKnowledgeBaseResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
