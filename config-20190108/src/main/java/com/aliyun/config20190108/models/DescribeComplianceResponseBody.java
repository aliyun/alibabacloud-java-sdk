// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceResponseBody extends TeaModel {
    @NameInMap("ComplianceResult")
    public DescribeComplianceResponseBodyComplianceResult complianceResult;

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
        @NameInMap("ComplianceType")
        public String complianceType;

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
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Compliances")
        public java.util.List<DescribeComplianceResponseBodyComplianceResultCompliances> compliances;

        public static DescribeComplianceResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceResponseBodyComplianceResult self = new DescribeComplianceResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceResponseBodyComplianceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeComplianceResponseBodyComplianceResult setCompliances(java.util.List<DescribeComplianceResponseBodyComplianceResultCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<DescribeComplianceResponseBodyComplianceResultCompliances> getCompliances() {
            return this.compliances;
        }

    }

}
