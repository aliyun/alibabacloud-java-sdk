// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RebindCardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebindCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebindCardsResponseBody self = new RebindCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public RebindCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
