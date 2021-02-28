// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeResponseBody self = new DeleteKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
