// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AAbckResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AAbckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AAbckResponseBody self = new AAbckResponseBody();
        return TeaModel.build(map, self);
    }

    public AAbckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
