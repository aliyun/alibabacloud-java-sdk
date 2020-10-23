// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ComplianceResult")
    @Validation(required = true)
    public DescribeComplianceResponseComplianceResult complianceResult;

    public static DescribeComplianceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceResponse self = new DescribeComplianceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComplianceResponse setComplianceResult(DescribeComplianceResponseComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public DescribeComplianceResponseComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public static class DescribeComplianceResponseComplianceResultCompliances extends TeaModel {
        @NameInMap("ComplianceType")
        @Validation(required = true)
        public String complianceType;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static DescribeComplianceResponseComplianceResultCompliances build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceResponseComplianceResultCompliances self = new DescribeComplianceResponseComplianceResultCompliances();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceResponseComplianceResultCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public DescribeComplianceResponseComplianceResultCompliances setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeComplianceResponseComplianceResult extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("Compliances")
        @Validation(required = true)
        public java.util.List<DescribeComplianceResponseComplianceResultCompliances> compliances;

        public static DescribeComplianceResponseComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceResponseComplianceResult self = new DescribeComplianceResponseComplianceResult();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceResponseComplianceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeComplianceResponseComplianceResult setCompliances(java.util.List<DescribeComplianceResponseComplianceResultCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<DescribeComplianceResponseComplianceResultCompliances> getCompliances() {
            return this.compliances;
        }

    }

}
