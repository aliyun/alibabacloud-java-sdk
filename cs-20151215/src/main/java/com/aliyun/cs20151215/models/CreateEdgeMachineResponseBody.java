// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateEdgeMachineResponseBody extends TeaModel {
    // edge machine id
    @NameInMap("edge_machine_id")
    public String edgeMachineId;

    // Id of the request
    @NameInMap("request_id")
    public String requestId;

    public static CreateEdgeMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMachineResponseBody self = new CreateEdgeMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMachineResponseBody setEdgeMachineId(String edgeMachineId) {
        this.edgeMachineId = edgeMachineId;
        return this;
    }
    public String getEdgeMachineId() {
        return this.edgeMachineId;
    }

    public CreateEdgeMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
