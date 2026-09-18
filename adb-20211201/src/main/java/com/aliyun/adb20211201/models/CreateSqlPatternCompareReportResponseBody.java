// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSqlPatternCompareReportResponseBody extends TeaModel {
    /**
     * <p>The ID of the created report. This value only indicates that the request has been accepted.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A1B2C3D-4E5F-6789-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSqlPatternCompareReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlPatternCompareReportResponseBody self = new CreateSqlPatternCompareReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlPatternCompareReportResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public CreateSqlPatternCompareReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
