// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachCenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachCenResponseBody self = new DetachCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
