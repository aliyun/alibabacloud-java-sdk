// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableSubscriptionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DisableSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionResponseBody self = new DisableSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
