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
         * <br>
         * <p>*   COMPLIANT: The relevant resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The relevant resources are evaluated as non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
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
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The information about rules in the compliance package.</p>
         */
        @NameInMap("ConfigRuleCompliances")
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances;

        /**
         * <p>The number of rules against which specific resources are evaluated as non-compliant.</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of rules in the compliance package.</p>
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

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setConfigRuleCompliances(java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances) {
            this.configRuleCompliances = configRuleCompliances;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> getConfigRuleCompliances() {
            return this.configRuleCompliances;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
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
