// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachEndUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachEndUserResponseBody self = new DetachEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
