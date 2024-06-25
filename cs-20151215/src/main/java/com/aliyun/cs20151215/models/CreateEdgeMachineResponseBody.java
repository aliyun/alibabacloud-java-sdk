// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateEdgeMachineResponseBody extends TeaModel {
    /**
     * <p>The ID of the cloud-native box.</p>
     * 
     * <strong>example:</strong>
     * <p>cc0725ddf688744979cd98445f67e****</p>
     */
    @NameInMap("edge_machine_id")
    public String edgeMachineId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;request_id&quot;: &quot;6e7b377a-c5ed-4388-8026-689e1b34****&quot;,</p>
     */
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
