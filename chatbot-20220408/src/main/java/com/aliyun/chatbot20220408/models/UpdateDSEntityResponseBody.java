// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateDSEntityResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDSEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDSEntityResponseBody self = new UpdateDSEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDSEntityResponseBody setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public UpdateDSEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
