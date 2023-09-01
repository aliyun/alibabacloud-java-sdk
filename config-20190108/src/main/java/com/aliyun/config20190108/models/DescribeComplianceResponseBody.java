// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceResponseBody extends TeaModel {
    /**
     * <p>The statistics of compliance evaluations.</p>
     */
    @NameInMap("ComplianceResult")
    public DescribeComplianceResponseBodyComplianceResult complianceResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComplianceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceResponseBody self = new DescribeComplianceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceResponseBody setComplianceResult(DescribeComplianceResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public DescribeComplianceResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public DescribeComplianceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComplianceResponseBodyComplianceResultCompliances extends TeaModel {
        /**
         * <p>The compliance evaluation result of the resource. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resource is evaluated to be compliant.</p>
         * <p>*   NON_COMPLIANT: The resource is evaluated to be non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to the resource.</p>
         * <p>*   INSUFFICIENT_DATA: The resource data is insufficient.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of compliance evaluations with the corresponding result.</p>
         * <br>
         * <p>*   This parameter returns the total number of evaluated resources if you set the ResourceId parameter in the request.</p>
         * <p>*   This parameter returns the total number of triggered rules if you set the ConfigRuleId parameter in the request.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DescribeComplianceResponseBodyComplianceResultCompliances build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceResponseBodyComplianceResultCompliances self = new DescribeComplianceResponseBodyComplianceResultCompliances();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceResponseBodyComplianceResultCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public DescribeComplianceResponseBodyComplianceResultCompliances setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeComplianceResponseBodyComplianceResult extends TeaModel {
        /**
         * <p>The compliance evaluation results based on compliance types.</p>
         */
        @NameInMap("Compliances")
        public java.util.List<DescribeComplianceResponseBodyComplianceResultCompliances> compliances;

        /**
         * <p>The total number of compliance evaluations.</p>
         * <br>
         * <p>*   This parameter returns the total number of evaluated resources if you set the ResourceId parameter in the request.</p>
         * <p>*   This parameter returns the total number of triggered rules if you set the ConfigRuleId parameter in the request.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeComplianceResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceResponseBodyComplianceResult self = new DescribeComplianceResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceResponseBodyComplianceResult setCompliances(java.util.List<DescribeComplianceResponseBodyComplianceResultCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<DescribeComplianceResponseBodyComplianceResultCompliances> getCompliances() {
            return this.compliances;
        }

        public DescribeComplianceResponseBodyComplianceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
