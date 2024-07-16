// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UnlockCardsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>81CB64DF-E328-50A3-B386-03CAD604C114</p>
     */
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
