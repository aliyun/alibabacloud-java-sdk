// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSqlPatternCompareReportResponseBody extends TeaModel {
    /**
     * <p>The time when the report was first canceled. The time is in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T01:06Z</p>
     */
    @NameInMap("CancelTime")
    public String cancelTime;

    /**
     * <p>Indicates whether the report is canceled. The value true is returned when the report is successfully canceled or canceled again.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Canceled")
    public Boolean canceled;

    /**
     * <p>The SQL Pattern comparison report ID.</p>
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

    public static CancelSqlPatternCompareReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelSqlPatternCompareReportResponseBody self = new CancelSqlPatternCompareReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelSqlPatternCompareReportResponseBody setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
        return this;
    }
    public String getCancelTime() {
        return this.cancelTime;
    }

    public CancelSqlPatternCompareReportResponseBody setCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }
    public Boolean getCanceled() {
        return this.canceled;
    }

    public CancelSqlPatternCompareReportResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public CancelSqlPatternCompareReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
