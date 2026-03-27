// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiagnoseReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>report-qe2s****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
