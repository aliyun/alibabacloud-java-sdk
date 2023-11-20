// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class EdgeClusterAddEdgeMachineResponseBody extends TeaModel {
    /**
     * <p>The ID of the cloud-native box.</p>
     */
    @NameInMap("edge_machine_id")
    public String edgeMachineId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static EdgeClusterAddEdgeMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EdgeClusterAddEdgeMachineResponseBody self = new EdgeClusterAddEdgeMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public EdgeClusterAddEdgeMachineResponseBody setEdgeMachineId(String edgeMachineId) {
        this.edgeMachineId = edgeMachineId;
        return this;
    }
    public String getEdgeMachineId() {
        return this.edgeMachineId;
    }

    public EdgeClusterAddEdgeMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
