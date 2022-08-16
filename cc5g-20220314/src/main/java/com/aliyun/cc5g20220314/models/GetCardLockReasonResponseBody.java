// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardLockReasonResponseBody extends TeaModel {
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCardLockReasonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardLockReasonResponseBody self = new GetCardLockReasonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardLockReasonResponseBody setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public GetCardLockReasonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
