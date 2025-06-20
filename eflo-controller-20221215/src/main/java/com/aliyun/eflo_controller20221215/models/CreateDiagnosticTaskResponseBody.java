// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateDiagnosticTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the diagnostics task.</p>
     * 
     * <strong>example:</strong>
     * <p>diag-i150553931717380274931</p>
     */
    @NameInMap("DiagnosticId")
    public String diagnosticId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A511C02A-0127-51AA-A9F9-966382C9A1B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiagnosticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticTaskResponseBody self = new CreateDiagnosticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticTaskResponseBody setDiagnosticId(String diagnosticId) {
        this.diagnosticId = diagnosticId;
        return this;
    }
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    public CreateDiagnosticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
