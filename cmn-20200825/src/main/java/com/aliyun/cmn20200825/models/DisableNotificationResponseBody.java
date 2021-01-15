// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DisableNotificationResponseBody extends TeaModel {
    // request id
    @NameInMap("RequestId")
    public String requestId;

    public static DisableNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableNotificationResponseBody self = new DisableNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
