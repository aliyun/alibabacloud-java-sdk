// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DagId")
    @Validation(required = true)
    public Long dagId;

    public static RunManualDagNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunManualDagNodesResponse self = new RunManualDagNodesResponse();
        return TeaModel.build(map, self);
    }

    public RunManualDagNodesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunManualDagNodesResponse setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

}
