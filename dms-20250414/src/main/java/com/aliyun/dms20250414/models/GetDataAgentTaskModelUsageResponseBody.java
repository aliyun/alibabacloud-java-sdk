// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageResponseBody extends TeaModel {
    /**
     * <p>The summary data of model usage for DataAgent analysis tasks.</p>
     */
    @NameInMap("Data")
    public GetDataAgentTaskModelUsageResponseBodyData data;

    /**
     * <p>The error code returned when a request exception occurs.</p>
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
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-***695C</p>
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

    public static GetDataAgentTaskModelUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageResponseBody self = new GetDataAgentTaskModelUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageResponseBody setData(GetDataAgentTaskModelUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataAgentTaskModelUsageResponseBodyData getData() {
        return this.data;
    }

    public GetDataAgentTaskModelUsageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataAgentTaskModelUsageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAgentTaskModelUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAgentTaskModelUsageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetDataAgentTaskModelUsageResponseBodyData extends TeaModel {
        /**
         * <p>The acceleration ratio, which indicates the speed improvement brought by subtask parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>3.8</p>
         */
        @NameInMap("AccelerationRatio")
        public Double accelerationRatio;

        /**
         * <p>The number of throttled sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RateLimitedSessionCount")
        public Long rateLimitedSessionCount;

        /**
         * <p>The total throttling duration of all sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("TotalLlmWaitDuration")
        public Double totalLlmWaitDuration;

        /**
         * <p>The total number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("TotalSessionCount")
        public Long totalSessionCount;

        /**
         * <p>The peak TPM within the query time range, which is the maximum number of tokens consumed per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>42000</p>
         */
        @NameInMap("peakTpm")
        public Long peakTpm;

        /**
         * <p>The total number of model calls within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("totalCallCount")
        public Long totalCallCount;

        /**
         * <p>The total number of tokens consumed within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>3560000</p>
         */
        @NameInMap("totalTokenConsumed")
        public Long totalTokenConsumed;

        /**
         * <p>The number of models used within the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("usedModels")
        public Long usedModels;

        public static GetDataAgentTaskModelUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAgentTaskModelUsageResponseBodyData self = new GetDataAgentTaskModelUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataAgentTaskModelUsageResponseBodyData setAccelerationRatio(Double accelerationRatio) {
            this.accelerationRatio = accelerationRatio;
            return this;
        }
        public Double getAccelerationRatio() {
            return this.accelerationRatio;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setRateLimitedSessionCount(Long rateLimitedSessionCount) {
            this.rateLimitedSessionCount = rateLimitedSessionCount;
            return this;
        }
        public Long getRateLimitedSessionCount() {
            return this.rateLimitedSessionCount;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setTotalLlmWaitDuration(Double totalLlmWaitDuration) {
            this.totalLlmWaitDuration = totalLlmWaitDuration;
            return this;
        }
        public Double getTotalLlmWaitDuration() {
            return this.totalLlmWaitDuration;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setTotalSessionCount(Long totalSessionCount) {
            this.totalSessionCount = totalSessionCount;
            return this;
        }
        public Long getTotalSessionCount() {
            return this.totalSessionCount;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setPeakTpm(Long peakTpm) {
            this.peakTpm = peakTpm;
            return this;
        }
        public Long getPeakTpm() {
            return this.peakTpm;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setTotalCallCount(Long totalCallCount) {
            this.totalCallCount = totalCallCount;
            return this;
        }
        public Long getTotalCallCount() {
            return this.totalCallCount;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setTotalTokenConsumed(Long totalTokenConsumed) {
            this.totalTokenConsumed = totalTokenConsumed;
            return this;
        }
        public Long getTotalTokenConsumed() {
            return this.totalTokenConsumed;
        }

        public GetDataAgentTaskModelUsageResponseBodyData setUsedModels(Long usedModels) {
            this.usedModels = usedModels;
            return this;
        }
        public Long getUsedModels() {
            return this.usedModels;
        }

    }

}
