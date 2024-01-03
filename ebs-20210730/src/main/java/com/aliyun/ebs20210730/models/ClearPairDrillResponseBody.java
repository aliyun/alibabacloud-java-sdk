// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearPairDrillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearPairDrillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearPairDrillResponseBody self = new ClearPairDrillResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearPairDrillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
