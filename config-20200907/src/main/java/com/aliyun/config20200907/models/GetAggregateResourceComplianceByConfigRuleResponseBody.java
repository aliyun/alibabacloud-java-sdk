// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The compliance result.</p>
     */
    @NameInMap("ComplianceResult")
    public GetAggregateResourceComplianceByConfigRuleResponseBodyComplianceResult complianceResult;

    /**
     * <p>The request ID.</p>
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
         * <p>The compliance evaluation results of the resources. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resource was evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resource was evaluated as incompliant.</p>
         * <p>*   NOT_APPLICABLE: The rule did not apply to your resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data was available.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of resources that have compliance evaluation results. For example, if the value of the `ComplianceType` parameter is `COMPLIANT`, this parameter value indicates the number of compliant resources.</p>
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
         * <p>The compliance list result.</p>
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
