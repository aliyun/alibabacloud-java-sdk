// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ReleaseSubscriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSubscriptionResponseBody self = new ReleaseSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
