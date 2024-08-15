// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableSubscriptionResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>10REQUES-AC5C-4B59-BE11-378F117A6A88</p>
     */
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
