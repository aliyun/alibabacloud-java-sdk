// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateEntityResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityResponseBody self = new UpdateEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEntityResponseBody setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public UpdateEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
