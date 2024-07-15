// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class PushMeteringDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94E89857-B994-44B6-9C4F-DBD200E9XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushMeteringDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataResponseBody self = new PushMeteringDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
