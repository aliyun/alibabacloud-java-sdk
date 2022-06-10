// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDSEntityResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDSEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSEntityResponseBody self = new DeleteDSEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDSEntityResponseBody setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DeleteDSEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
