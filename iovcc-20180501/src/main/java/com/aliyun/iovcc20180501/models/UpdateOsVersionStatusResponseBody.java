// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOsVersionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionStatusResponseBody self = new UpdateOsVersionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
