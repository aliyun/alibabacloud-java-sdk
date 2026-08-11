// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetRiskStatsResponseBody extends TeaModel {
    /**
     * <p>The ID assigned by the backend to uniquely identify a request. This ID can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of risk posture statistics.</p>
     */
    @NameInMap("RiskStats")
    public java.util.List<GetRiskStatsResponseBodyRiskStats> riskStats;

    public static GetRiskStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatsResponseBody self = new GetRiskStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRiskStatsResponseBody setRiskStats(java.util.List<GetRiskStatsResponseBodyRiskStats> riskStats) {
        this.riskStats = riskStats;
        return this;
    }
    public java.util.List<GetRiskStatsResponseBodyRiskStats> getRiskStats() {
        return this.riskStats;
    }

    public static class GetRiskStatsResponseBodyRiskStats extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <p>The number of detected risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>prompt_attack</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRiskStatsResponseBodyRiskStats build(java.util.Map<String, ?> map) throws Exception {
            GetRiskStatsResponseBodyRiskStats self = new GetRiskStatsResponseBodyRiskStats();
            return TeaModel.build(map, self);
        }

        public GetRiskStatsResponseBodyRiskStats setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public GetRiskStatsResponseBodyRiskStats setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetRiskStatsResponseBodyRiskStats setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
