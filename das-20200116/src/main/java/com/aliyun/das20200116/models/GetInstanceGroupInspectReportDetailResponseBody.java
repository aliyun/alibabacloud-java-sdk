// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportDetailResponseBody extends TeaModel {
    /**
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
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("ReportDetail")
        public String reportDetail;

        /**
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
