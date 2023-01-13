// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticReportsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiagnosticReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticReportsResponseBody self = new DeleteDiagnosticReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
