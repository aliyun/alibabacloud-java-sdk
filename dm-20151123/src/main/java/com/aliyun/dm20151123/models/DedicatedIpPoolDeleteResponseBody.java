// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolDeleteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DedicatedIpPoolDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolDeleteResponseBody self = new DedicatedIpPoolDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
