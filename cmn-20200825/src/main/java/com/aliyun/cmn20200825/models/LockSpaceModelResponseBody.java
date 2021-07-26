// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class LockSpaceModelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static LockSpaceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockSpaceModelResponseBody self = new LockSpaceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public LockSpaceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
