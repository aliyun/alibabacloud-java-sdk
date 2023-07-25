// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("ComplianceResult")
    public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult complianceResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateResourceComplianceByConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByConfigRuleResponseBody self = new GetAggregateResourceComplianceByConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByConfigRuleResponseBody setComplianceResult(GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public GetAggregateResourceComplianceByConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances extends TeaModel {
        /**
         * <p>The compliance evaluation result of the resources. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
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

        public static GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances self = new GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult extends TeaModel {
        /**
         * <p>The compliance evaluation results returned.</p>
         */
        @NameInMap("Compliances")
        public java.util.List<GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances> compliances;

        /**
         * <p>The total number of evaluated resources.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult self = new GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult setCompliances(java.util.List<GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResultCompliances> getCompliances() {
            return this.compliances;
        }

        public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
