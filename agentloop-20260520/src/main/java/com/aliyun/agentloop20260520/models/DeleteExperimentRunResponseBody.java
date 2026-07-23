// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteExperimentRunResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019F89BE-9190-3AAA-B5A4-DBAE3BABBBEA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteExperimentRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentRunResponseBody self = new DeleteExperimentRunResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
