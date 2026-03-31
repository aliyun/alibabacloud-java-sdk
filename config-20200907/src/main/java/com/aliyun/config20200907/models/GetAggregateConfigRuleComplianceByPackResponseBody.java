// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The compliance evaluation results that are returned by rules in the compliance package.</p>
     */
    @NameInMap("ConfigRuleComplianceResult")
    public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The compliance evaluation result returned by the rule. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The relevant resources are evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The relevant resources are evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to your resources.</li>
         * <li>INSUFFICIENT_DATA: No resource data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-fdc8626622af00f9****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rule-name</p>
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
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af0087****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The information about rules in the compliance package.</p>
         */
        @NameInMap("ConfigRuleCompliances")
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances;

        @NameInMap("IgnoredCount")
        public Integer ignoredCount;

        @NameInMap("InsufficientDataCount")
        public Integer insufficientDataCount;

        /**
         * <p>The number of rules against which specific resources are evaluated as non-compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        @NameInMap("NotApplicableCount")
        public Integer notApplicableCount;

        /**
         * <p>The total number of rules in the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
