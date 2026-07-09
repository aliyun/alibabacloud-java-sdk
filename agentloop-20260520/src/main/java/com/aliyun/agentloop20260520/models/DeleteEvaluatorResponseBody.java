// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluatorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteEvaluatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluatorResponseBody self = new DeleteEvaluatorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
