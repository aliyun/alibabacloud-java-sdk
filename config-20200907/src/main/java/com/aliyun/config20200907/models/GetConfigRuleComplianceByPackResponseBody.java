// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The compliance results for the rules in the compliance package.</p>
     */
    @NameInMap("ConfigRuleComplianceResult")
    public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigRuleComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleComplianceByPackResponseBody self = new GetConfigRuleComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleComplianceByPackResponseBody setConfigRuleComplianceResult(GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult) {
        this.configRuleComplianceResult = configRuleComplianceResult;
        return this;
    }
    public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult getConfigRuleComplianceResult() {
        return this.configRuleComplianceResult;
    }

    public GetConfigRuleComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances extends TeaModel {
        /**
         * <p>The compliance evaluation result of the rule. Valid values:</p>
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
         * <p>The ID of the rule in the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-fdc8626622af00f9****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule in the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>The bandwidth of the Elastic IP instance meets the minimum requirements.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        public static GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances self = new GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

    }

    public static class GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult extends TeaModel {
        /**
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af0087****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The number of compliant rules.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The list of rules in the compliance package and their compliance results.</p>
         */
        @NameInMap("ConfigRuleCompliances")
        public java.util.List<GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances;

        /**
         * <p>The number of ignored rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoredCount")
        public Integer ignoredCount;

        /**
         * <p>The total number of rules within the compliance package whose evaluation results are &quot;No Data&quot; when assessing resources.</p>
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
         * <p>0</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The number of rules that are not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public static GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult self = new GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setConfigRuleCompliances(java.util.List<GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances) {
            this.configRuleCompliances = configRuleCompliances;
            return this;
        }
        public java.util.List<GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> getConfigRuleCompliances() {
            return this.configRuleCompliances;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setIgnoredCount(Integer ignoredCount) {
            this.ignoredCount = ignoredCount;
            return this;
        }
        public Integer getIgnoredCount() {
            return this.ignoredCount;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setInsufficientDataCount(Integer insufficientDataCount) {
            this.insufficientDataCount = insufficientDataCount;
            return this;
        }
        public Integer getInsufficientDataCount() {
            return this.insufficientDataCount;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNotApplicableCount(Integer notApplicableCount) {
            this.notApplicableCount = notApplicableCount;
            return this;
        }
        public Integer getNotApplicableCount() {
            return this.notApplicableCount;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
