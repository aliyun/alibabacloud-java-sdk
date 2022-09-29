// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class FailCardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static FailCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FailCardsResponseBody self = new FailCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public FailCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
