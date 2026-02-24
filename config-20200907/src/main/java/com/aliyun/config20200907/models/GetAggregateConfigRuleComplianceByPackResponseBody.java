// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The compliance results of the rules in the compliance pack.</p>
     */
    @NameInMap("ConfigRuleComplianceResult")
    public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6B0C0A8-3245-48F1-AEAB-BC1A446E99D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigRuleComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleComplianceByPackResponseBody self = new GetAggregateConfigRuleComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleComplianceByPackResponseBody setConfigRuleComplianceResult(GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult) {
        this.configRuleComplianceResult = configRuleComplianceResult;
        return this;
    }
    public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult getConfigRuleComplianceResult() {
        return this.configRuleComplianceResult;
    }

    public GetAggregateConfigRuleComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances extends TeaModel {
        /**
         * <p>The compliance result. Valid values:</p>
         * <ul>
         * <li><p>COMPLIANT: The rule is compliant.</p>
         * </li>
         * <li><p>NON_COMPLIANT: The rule is non-compliant.</p>
         * </li>
         * <li><p>NOT_APPLICABLE: The rule is not applicable.</p>
         * </li>
         * <li><p>INSUFFICIENT_DATA: No data is available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The ID of the rule in the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-fdc8626622af00f9****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule in the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>The bandwidth of the Elastic IP instance meets the minimum requirements.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        public static GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances self = new GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

    }

    public static class GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult extends TeaModel {
        /**
         * <p>The ID of the compliance pack.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af0087****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The total number of rules for which all evaluation results are <strong>Compliant</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>A list of rule compliance results.</p>
         */
        @NameInMap("ConfigRuleCompliances")
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances;

        /**
         * <p>The total number of rules whose evaluation results include <strong>Ignored</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoredCount")
        public Integer ignoredCount;

        /**
         * <p>The total number of rules whose evaluation results include <strong>Insufficient Data</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InsufficientDataCount")
        public Integer insufficientDataCount;

        /**
         * <p>The number of non-compliant rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of rules whose evaluation results include <strong>Not Applicable</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NotApplicableCount")
        public Integer notApplicableCount;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult self = new GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setConfigRuleCompliances(java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances) {
            this.configRuleCompliances = configRuleCompliances;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> getConfigRuleCompliances() {
            return this.configRuleCompliances;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setIgnoredCount(Integer ignoredCount) {
            this.ignoredCount = ignoredCount;
            return this;
        }
        public Integer getIgnoredCount() {
            return this.ignoredCount;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setInsufficientDataCount(Integer insufficientDataCount) {
            this.insufficientDataCount = insufficientDataCount;
            return this;
        }
        public Integer getInsufficientDataCount() {
            return this.insufficientDataCount;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNotApplicableCount(Integer notApplicableCount) {
            this.notApplicableCount = notApplicableCount;
            return this;
        }
        public Integer getNotApplicableCount() {
            return this.notApplicableCount;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
