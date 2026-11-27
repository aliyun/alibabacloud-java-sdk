// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSqlPatternCompareReportResponseBody extends TeaModel {
    /**
     * <p>The time of the first cancellation. The time is displayed in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T01:06Z</p>
     */
    @NameInMap("CancelTime")
    public String cancelTime;

    /**
     * <p>Indicates whether the report is canceled. true is returned if the cancellation is successful or if the report is repeatedly canceled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Canceled")
    public Boolean canceled;

    /**
     * <p>The ID of the SQL pattern comparison report.</p>
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
