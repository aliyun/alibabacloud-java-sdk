// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04DEB304-2436-4CB9-BB63-468BCEA03D9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachEaiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachEaiResponseBody self = new DetachEaiResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachEaiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
