// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteDSEntityValueResponseBody extends TeaModel {
    @NameInMap("EntityValueId")
    public Long entityValueId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDSEntityValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSEntityValueResponseBody self = new DeleteDSEntityValueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDSEntityValueResponseBody setEntityValueId(Long entityValueId) {
        this.entityValueId = entityValueId;
        return this;
    }
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    public DeleteDSEntityValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
