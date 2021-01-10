// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DelayPublishOsVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DelayPublishOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelayPublishOsVersionResponseBody self = new DelayPublishOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DelayPublishOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
