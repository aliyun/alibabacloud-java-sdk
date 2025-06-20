// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticResultRequest extends TeaModel {
    /**
     * <p>The diagnostic task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>diag-i151942361720577788844</p>
     */
    @NameInMap("DiagnosticId")
    public String diagnosticId;

    public static DescribeDiagnosticResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticResultRequest self = new DescribeDiagnosticResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticResultRequest setDiagnosticId(String diagnosticId) {
        this.diagnosticId = diagnosticId;
        return this;
    }
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

}
