// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticMetricSetsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiagnosticMetricSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticMetricSetsResponseBody self = new DeleteDiagnosticMetricSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticMetricSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
