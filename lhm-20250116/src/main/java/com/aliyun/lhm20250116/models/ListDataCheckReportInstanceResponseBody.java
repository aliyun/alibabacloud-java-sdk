// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportInstanceResponseBody extends TeaModel {
    /**
     * <p>The list of report historical instances.</p>
     */
    @NameInMap("data")
    public java.util.List<ListDataCheckReportInstanceResponseBodyData> data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues for this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Troubleshoot by using errCode and errMessage.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListDataCheckReportInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportInstanceResponseBody self = new ListDataCheckReportInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportInstanceResponseBody setData(java.util.List<ListDataCheckReportInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckReportInstanceResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckReportInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckReportInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckReportInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckReportInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataCheckReportInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("batchId")
        public String batchId;

        /**
         * <p>The report label.</p>
         * 
         * <strong>example:</strong>
         * <p>daily_check</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The report generation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 12:00:00</p>
         */
        @NameInMap("reportTime")
        public String reportTime;

        public static ListDataCheckReportInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckReportInstanceResponseBodyData self = new ListDataCheckReportInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckReportInstanceResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public ListDataCheckReportInstanceResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListDataCheckReportInstanceResponseBodyData setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

    }

}
