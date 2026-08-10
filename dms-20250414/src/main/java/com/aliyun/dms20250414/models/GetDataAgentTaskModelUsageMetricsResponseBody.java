// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageMetricsResponseBody extends TeaModel {
    /**
     * <p>The list of TPM time series metrics for model usage, returned in chronological order with usage at each time point.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetDataAgentTaskModelUsageMetricsResponseBodyData> data;

    /**
     * <p>The error code returned when the request is abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>DMS-DA-40411</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-***7695C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAgentTaskModelUsageMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageMetricsResponseBody self = new GetDataAgentTaskModelUsageMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageMetricsResponseBody setData(java.util.List<GetDataAgentTaskModelUsageMetricsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDataAgentTaskModelUsageMetricsResponseBodyData> getData() {
        return this.data;
    }

    public GetDataAgentTaskModelUsageMetricsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataAgentTaskModelUsageMetricsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAgentTaskModelUsageMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAgentTaskModelUsageMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataAgentTaskModelUsageMetricsResponseBodyData extends TeaModel {
        /**
         * <p>The start time of the statistical interval for this time series point. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The end time of the statistical interval for this time series point. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660860</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The TPM for this time series point, which is the number of tokens consumed within the statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("Tpm")
        public Long tpm;

        public static GetDataAgentTaskModelUsageMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAgentTaskModelUsageMetricsResponseBodyData self = new GetDataAgentTaskModelUsageMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataAgentTaskModelUsageMetricsResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetDataAgentTaskModelUsageMetricsResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDataAgentTaskModelUsageMetricsResponseBodyData setTpm(Long tpm) {
            this.tpm = tpm;
            return this;
        }
        public Long getTpm() {
            return this.tpm;
        }

    }

}
