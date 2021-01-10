// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishOsVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishOsVersionResponseBody self = new PublishOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
