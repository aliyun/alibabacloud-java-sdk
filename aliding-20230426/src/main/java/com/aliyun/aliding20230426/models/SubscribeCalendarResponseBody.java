// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeCalendarResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SubscribeCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubscribeCalendarResponseBody self = new SubscribeCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public SubscribeCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
