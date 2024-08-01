// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DestroyInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65BDA532-28AF-4122-AA39-B382721E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DestroyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyInstanceResponseBody self = new DestroyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
