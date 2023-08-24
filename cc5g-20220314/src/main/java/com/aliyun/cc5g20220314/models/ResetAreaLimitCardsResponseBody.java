// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ResetAreaLimitCardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAreaLimitCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAreaLimitCardsResponseBody self = new ResetAreaLimitCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAreaLimitCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
