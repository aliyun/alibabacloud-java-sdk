// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListKnowledgeBasesOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListKnowledgeBasesResult build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesResult self = new ListKnowledgeBasesResult();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBasesResult setData(ListKnowledgeBasesOutput data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBasesOutput getData() {
        return this.data;
    }

    public ListKnowledgeBasesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
