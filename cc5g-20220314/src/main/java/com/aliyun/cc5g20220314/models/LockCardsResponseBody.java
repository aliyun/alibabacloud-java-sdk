// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class LockCardsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static LockCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockCardsResponseBody self = new LockCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public LockCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
