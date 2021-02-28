// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateEntityResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityResponseBody self = new CreateEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEntityResponseBody setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
