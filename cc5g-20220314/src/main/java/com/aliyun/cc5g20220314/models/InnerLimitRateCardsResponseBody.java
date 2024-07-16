// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class InnerLimitRateCardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InnerLimitRateCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerLimitRateCardsResponseBody self = new InnerLimitRateCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerLimitRateCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
