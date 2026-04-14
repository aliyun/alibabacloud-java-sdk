// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolCreateResponseBody extends TeaModel {
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

    public static DedicatedIpPoolCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolCreateResponseBody self = new DedicatedIpPoolCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolCreateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DedicatedIpPoolCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
