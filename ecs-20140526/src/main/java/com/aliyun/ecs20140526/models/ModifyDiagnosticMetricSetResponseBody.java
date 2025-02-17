// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiagnosticMetricSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiagnosticMetricSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiagnosticMetricSetResponseBody self = new ModifyDiagnosticMetricSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiagnosticMetricSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
