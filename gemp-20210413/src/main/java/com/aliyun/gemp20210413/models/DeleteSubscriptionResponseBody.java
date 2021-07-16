// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static DeleteSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscriptionResponseBody self = new DeleteSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
