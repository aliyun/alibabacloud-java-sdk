// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UnlockCardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnlockCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockCardsResponseBody self = new UnlockCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
