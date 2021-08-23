// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteEntityResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityResponseBody self = new DeleteEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEntityResponseBody setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DeleteEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
