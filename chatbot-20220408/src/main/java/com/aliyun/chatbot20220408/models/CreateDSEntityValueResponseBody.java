// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityValueResponseBody extends TeaModel {
    @NameInMap("EntityValueId")
    public Long entityValueId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDSEntityValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityValueResponseBody self = new CreateDSEntityValueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityValueResponseBody setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public CreateDSEntityValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
