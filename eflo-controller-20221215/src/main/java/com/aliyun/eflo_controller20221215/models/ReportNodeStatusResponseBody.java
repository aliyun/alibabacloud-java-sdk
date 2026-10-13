// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodeStatusResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource Not Found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The fault report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156837191934</p>
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

    public static ReportNodeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportNodeStatusResponseBody self = new ReportNodeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportNodeStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReportNodeStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReportNodeStatusResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ReportNodeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
