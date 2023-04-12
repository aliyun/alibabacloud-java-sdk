// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The compliance evaluation results returned.</p>
     */
    @NameInMap("ComplianceResult")
    public GetResourceComplianceByConfigRuleResponseBodyComplianceResult complianceResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceComplianceByConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByConfigRuleResponseBody self = new GetResourceComplianceByConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByConfigRuleResponseBody setComplianceResult(GetResourceComplianceByConfigRuleResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public GetResourceComplianceByConfigRuleResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public GetResourceComplianceByConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances extends TeaModel {
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
         * <p>The number of resources that have the compliance evaluation result. For example, if the value of the `ComplianceType` parameter is `COMPLIANT`, this parameter value indicates the number of compliant resources.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances self = new GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetResourceComplianceByConfigRuleResponseBodyComplianceResult extends TeaModel {
        /**
         * <p>The information about the compliance evaluation.</p>
         */
        @NameInMap("Compliances")
        public java.util.List<GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances> compliances;

        /**
         * <p>The total number of evaluated resources.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetResourceComplianceByConfigRuleResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceByConfigRuleResponseBodyComplianceResult self = new GetResourceComplianceByConfigRuleResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceByConfigRuleResponseBodyComplianceResult setCompliances(java.util.List<GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<GetResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances> getCompliances() {
            return this.compliances;
        }

        public GetResourceComplianceByConfigRuleResponseBodyComplianceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
