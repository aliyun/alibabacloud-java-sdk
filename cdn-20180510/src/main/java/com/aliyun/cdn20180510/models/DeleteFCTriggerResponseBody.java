// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteFCTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFCTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFCTriggerResponseBody self = new DeleteFCTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFCTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
