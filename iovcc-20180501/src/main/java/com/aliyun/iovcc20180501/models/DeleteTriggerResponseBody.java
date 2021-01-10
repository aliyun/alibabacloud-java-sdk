// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerResponseBody self = new DeleteTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
