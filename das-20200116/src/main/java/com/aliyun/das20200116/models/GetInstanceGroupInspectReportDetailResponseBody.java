// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportDetailResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ReportDetail</p>
     */
    @NameInMap("Data")
    public GetInstanceGroupInspectReportDetailResponseBodyData data;

    /**
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, exception information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetInstanceGroupInspectReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGroupInspectReportDetailResponseBody self = new GetInstanceGroupInspectReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceGroupInspectReportDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceGroupInspectReportDetailResponseBody setData(GetInstanceGroupInspectReportDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceGroupInspectReportDetailResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceGroupInspectReportDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceGroupInspectReportDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceGroupInspectReportDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceGroupInspectReportDetailResponseBodyData extends TeaModel {
        /**
         * <p>The content of the automated operations report, including the report date and diagnostic details of managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;### 概要\n\n报告日期：2025-12-10  \n对比周期：[昨日日期] → 2025-12-10 以下省略&quot;</p>
         */
        @NameInMap("ReportDetail")
        public String reportDetail;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13f52040-5a6e-42c3-bb84-051f5d6d****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        public static GetInstanceGroupInspectReportDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceGroupInspectReportDetailResponseBodyData self = new GetInstanceGroupInspectReportDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceGroupInspectReportDetailResponseBodyData setReportDetail(String reportDetail) {
            this.reportDetail = reportDetail;
            return this;
        }
        public String getReportDetail() {
            return this.reportDetail;
        }

        public GetInstanceGroupInspectReportDetailResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

    }

}
