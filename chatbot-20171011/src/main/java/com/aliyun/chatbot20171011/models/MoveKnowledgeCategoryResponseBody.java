// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class MoveKnowledgeCategoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MoveKnowledgeCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveKnowledgeCategoryResponseBody self = new MoveKnowledgeCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveKnowledgeCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
