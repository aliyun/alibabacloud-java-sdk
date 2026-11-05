// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteApplicationAssignmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABA822EE-85C2-4418-9577-A1831FC8466D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationAssignmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationAssignmentResponseBody self = new DeleteApplicationAssignmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationAssignmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
