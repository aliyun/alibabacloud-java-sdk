// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class KnowledgeBaseResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public KnowledgeBase data;

    @NameInMap("requestId")
    public String requestId;

    public static KnowledgeBaseResult build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseResult self = new KnowledgeBaseResult();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public KnowledgeBaseResult setData(KnowledgeBase data) {
        this.data = data;
        return this;
    }
    public KnowledgeBase getData() {
        return this.data;
    }

    public KnowledgeBaseResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
