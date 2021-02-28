// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableKnowledgeResponseBody self = new DisableKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
