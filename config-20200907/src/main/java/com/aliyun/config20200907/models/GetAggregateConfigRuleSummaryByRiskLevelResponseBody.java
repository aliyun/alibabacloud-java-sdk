// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    /**
     * <p>The summary of compliance evaluation results by rule risk level.</p>
     */
    @NameInMap("ConfigRuleSummaries")
    public java.util.List<GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3CDD98C-DE65-46AC-B2D2-04A4A9AB5B73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigRuleSummaryByRiskLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleSummaryByRiskLevelResponseBody self = new GetAggregateConfigRuleSummaryByRiskLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponseBody setConfigRuleSummaries(java.util.List<GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries) {
        this.configRuleSummaries = configRuleSummaries;
        return this;
    }
    public java.util.List<GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> getConfigRuleSummaries() {
        return this.configRuleSummaries;
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries extends TeaModel {
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
         * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries self = new GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}
