// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportListResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List<ReportStatus></p>
     */
    @NameInMap("Data")
    public java.util.List<GetInstanceGroupInspectReportListResponseBodyData> data;

    /**
     * <p>The response message.</p>
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
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetInstanceGroupInspectReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGroupInspectReportListResponseBody self = new GetInstanceGroupInspectReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceGroupInspectReportListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceGroupInspectReportListResponseBody setData(java.util.List<GetInstanceGroupInspectReportListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInstanceGroupInspectReportListResponseBodyData> getData() {
        return this.data;
    }

    public GetInstanceGroupInspectReportListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceGroupInspectReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceGroupInspectReportListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceGroupInspectReportListResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11 00:39:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The date of the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-10</p>
         */
        @NameInMap("ReportDate")
        public String reportDate;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13f52040-5a6e-42c3-bb84-051f5d6d****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The task status. Valid values: WAITING_UNREADY = 0, WAITING_READY = 1, PROCESSING = 2, FINISHED = 3, ERROR = 4, STOPPED = -1.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceGroupInspectReportListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceGroupInspectReportListResponseBodyData self = new GetInstanceGroupInspectReportListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceGroupInspectReportListResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetInstanceGroupInspectReportListResponseBodyData setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public String getReportDate() {
            return this.reportDate;
        }

        public GetInstanceGroupInspectReportListResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetInstanceGroupInspectReportListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
