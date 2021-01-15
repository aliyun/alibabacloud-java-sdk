// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class EnableNotificationResponseBody extends TeaModel {
    // request id
    @NameInMap("RequestId")
    public String requestId;

    public static EnableNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableNotificationResponseBody self = new EnableNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
