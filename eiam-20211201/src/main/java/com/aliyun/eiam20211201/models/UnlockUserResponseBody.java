// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnlockUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnlockUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockUserResponseBody self = new UnlockUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
