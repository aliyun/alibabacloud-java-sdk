// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionResponseBody self = new UpdateOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
