// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AppendEntityMemberResponseBody extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("RequestId")
    public String requestId;

    public static AppendEntityMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppendEntityMemberResponseBody self = new AppendEntityMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AppendEntityMemberResponseBody setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public AppendEntityMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
