// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopNodeDiagnosticRequest extends TeaModel {
    /**
     * <p>The report ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15678327322</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static StopNodeDiagnosticRequest build(java.util.Map<String, ?> map) throws Exception {
        StopNodeDiagnosticRequest self = new StopNodeDiagnosticRequest();
        return TeaModel.build(map, self);
    }

    public StopNodeDiagnosticRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
