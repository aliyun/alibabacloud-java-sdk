// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class InnerStopCardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InnerStopCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerStopCardsResponseBody self = new InnerStopCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerStopCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
