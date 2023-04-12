// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation results returned.</p>
     */
    @NameInMap("ConfigRuleComplianceResult")
    public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The compliance evaluation result. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The relevant resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The relevant resources are evaluated as non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The ID of the rule enabled in the compliance package.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule enabled in the compliance package.</p>
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
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The rule enabled in the compliance package and the compliance evaluation result returned by the rule.</p>
         */
        @NameInMap("ConfigRuleCompliances")
        public java.util.List<GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances;

        /**
         * <p>The number of rules against which specific resources are evaluated as non-compliant.</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of rules enabled in the compliance package.</p>
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

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setConfigRuleCompliances(java.util.List<GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances) {
            this.configRuleCompliances = configRuleCompliances;
            return this;
        }
        public java.util.List<GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> getConfigRuleCompliances() {
            return this.configRuleCompliances;
        }

        public GetConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
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
