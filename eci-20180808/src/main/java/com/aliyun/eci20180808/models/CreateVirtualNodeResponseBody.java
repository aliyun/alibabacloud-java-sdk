// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateVirtualNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>89164E78-FC82-4684-BE97-DCDD85D26546</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VNode.</p>
     * 
     * <strong>example:</strong>
     * <p>vnd-2ze960zkdqrldeaw****</p>
     */
    @NameInMap("VirtualNodeId")
    public String virtualNodeId;

    public static CreateVirtualNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualNodeResponseBody self = new CreateVirtualNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualNodeResponseBody setVirtualNodeId(String virtualNodeId) {
        this.virtualNodeId = virtualNodeId;
        return this;
    }
    public String getVirtualNodeId() {
        return this.virtualNodeId;
    }

}
