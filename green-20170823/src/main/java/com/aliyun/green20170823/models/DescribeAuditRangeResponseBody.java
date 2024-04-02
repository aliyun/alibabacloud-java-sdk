// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditRangeResponseBody extends TeaModel {
    @NameInMap("AuditRange")
    public DescribeAuditRangeResponseBodyAuditRange auditRange;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAuditRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditRangeResponseBody self = new DescribeAuditRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditRangeResponseBody setAuditRange(DescribeAuditRangeResponseBodyAuditRange auditRange) {
        this.auditRange = auditRange;
        return this;
    }
    public DescribeAuditRangeResponseBodyAuditRange getAuditRange() {
        return this.auditRange;
    }

    public DescribeAuditRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAuditRangeResponseBodyAuditRange extends TeaModel {
        @NameInMap("block")
        public Boolean block;

        @NameInMap("pass")
        public Boolean pass;

        @NameInMap("review")
        public Boolean review;

        public static DescribeAuditRangeResponseBodyAuditRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditRangeResponseBodyAuditRange self = new DescribeAuditRangeResponseBodyAuditRange();
            return TeaModel.build(map, self);
        }

        public DescribeAuditRangeResponseBodyAuditRange setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeAuditRangeResponseBodyAuditRange setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public DescribeAuditRangeResponseBodyAuditRange setReview(Boolean review) {
            this.review = review;
            return this;
        }
        public Boolean getReview() {
            return this.review;
        }

    }

}
