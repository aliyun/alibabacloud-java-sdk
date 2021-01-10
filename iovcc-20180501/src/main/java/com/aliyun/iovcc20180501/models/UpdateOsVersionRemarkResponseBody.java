// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionRemarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOsVersionRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionRemarkResponseBody self = new UpdateOsVersionRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
