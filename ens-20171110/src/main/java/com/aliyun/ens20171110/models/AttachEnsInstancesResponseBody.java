// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachEnsInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachEnsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachEnsInstancesResponseBody self = new AttachEnsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachEnsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
