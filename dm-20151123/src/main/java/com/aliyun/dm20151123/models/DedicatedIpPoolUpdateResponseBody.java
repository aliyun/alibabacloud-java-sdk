// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolUpdateResponseBody extends TeaModel {
    /**
     * <p>IP pool ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DedicatedIpPoolUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolUpdateResponseBody self = new DedicatedIpPoolUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolUpdateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DedicatedIpPoolUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
