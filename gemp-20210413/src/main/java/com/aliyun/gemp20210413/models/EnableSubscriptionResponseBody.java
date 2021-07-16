// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableSubscriptionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static EnableSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSubscriptionResponseBody self = new EnableSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
