// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateManualDagResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the DAG generated when the manual workflow runs. You can use this DagId together with the relevant API to query the details and status of the internal node instances of this manual workflow run.</p>
     * 
     * <strong>example:</strong>
     * <p>700000123123141</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AASFDFSDFG-DFSDF-DFSDFD-SDFSDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateManualDagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagResponseBody self = new CreateManualDagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateManualDagResponseBody setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public CreateManualDagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
