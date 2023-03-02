// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the DAG for the manually triggered workflow. You can call an operation with this parameter as a request parameter to query the details and statuses of the nodes in this manually triggered workflow.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunManualDagNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunManualDagNodesResponseBody self = new RunManualDagNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunManualDagNodesResponseBody setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public RunManualDagNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
