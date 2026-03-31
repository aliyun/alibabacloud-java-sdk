// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    /**
     * <p>The summary of compliance evaluation results by rule risk level.</p>
     */
    @NameInMap("ConfigRuleSummaries")
    public java.util.List<GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A3CED98C-DE65-46AC-B2D2-04A4A9AB5B36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigRuleSummaryByRiskLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleSummaryByRiskLevelResponseBody self = new GetConfigRuleSummaryByRiskLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleSummaryByRiskLevelResponseBody setConfigRuleSummaries(java.util.List<GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries) {
        this.configRuleSummaries = configRuleSummaries;
        return this;
    }
    public java.util.List<GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> getConfigRuleSummaries() {
        return this.configRuleSummaries;
    }

    public GetConfigRuleSummaryByRiskLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries extends TeaModel {
        /**
         * <p>The number of rules against which specific resources are evaluated as compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of rules against which specific resources are evaluated as non-compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The risk level of the resources that are not compliant with the rules. Valid values:</p>
         * <ul>
         * <li>1: high risk level.</li>
         * <li>2: medium risk level.</li>
         * <li>3: low risk level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries self = new GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}
