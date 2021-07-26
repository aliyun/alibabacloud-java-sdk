// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateOsVersionResponseBody extends TeaModel {
    // Id of the request
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
