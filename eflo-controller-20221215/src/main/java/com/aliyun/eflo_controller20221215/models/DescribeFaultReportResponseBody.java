// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeFaultReportResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The time when the fault report was created. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-06 17:31:33</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the fault report.</p>
     * 
     * <strong>example:</strong>
     * <p>GPU 0 reporting XID 79 (fallen off bus)</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The diagnosis type.</p>
     * 
     * <strong>example:</strong>
     * <p>QUICK</p>
     */
    @NameInMap("DiagnosisType")
    public String diagnosisType;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource Not Found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The time when the fault report was processed. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-07 17:41:33</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100184932123</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the fault report.</p>
     * 
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeFaultReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultReportResponseBody self = new DescribeFaultReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeFaultReportResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeFaultReportResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFaultReportResponseBody setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    public DescribeFaultReportResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeFaultReportResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public DescribeFaultReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public DescribeFaultReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaultReportResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
