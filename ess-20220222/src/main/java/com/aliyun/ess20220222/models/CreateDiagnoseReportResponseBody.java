// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateDiagnoseReportResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the diagnostic report.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-uf6enpbnri1xhcy9qc7s</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0189C6CB-07BA-5AFE-B533-D93892324774</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnoseReportResponseBody self = new CreateDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnoseReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public CreateDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
