// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowResponseBody extends TeaModel {
    /**
     * <p>The dataflow ID.</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowResponseBody self = new CreateDataFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowResponseBody setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public CreateDataFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
