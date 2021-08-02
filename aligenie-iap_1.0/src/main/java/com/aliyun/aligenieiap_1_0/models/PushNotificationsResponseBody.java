// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PushNotificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushNotificationsResponseBody self = new PushNotificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public PushNotificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
