// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditSettingResponseBody extends TeaModel {
    @NameInMap("AuditRange")
    public DescribeAuditSettingResponseBodyAuditRange auditRange;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Seed")
    public String seed;

    public static DescribeAuditSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditSettingResponseBody self = new DescribeAuditSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditSettingResponseBody setAuditRange(DescribeAuditSettingResponseBodyAuditRange auditRange) {
        this.auditRange = auditRange;
        return this;
    }
    public DescribeAuditSettingResponseBodyAuditRange getAuditRange() {
        return this.auditRange;
    }

    public DescribeAuditSettingResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public DescribeAuditSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditSettingResponseBody setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

    public static class DescribeAuditSettingResponseBodyAuditRange extends TeaModel {
        @NameInMap("block")
        public Boolean block;

        @NameInMap("pass")
        public Boolean pass;

        @NameInMap("review")
        public Boolean review;

        public static DescribeAuditSettingResponseBodyAuditRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditSettingResponseBodyAuditRange self = new DescribeAuditSettingResponseBodyAuditRange();
            return TeaModel.build(map, self);
        }

        public DescribeAuditSettingResponseBodyAuditRange setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeAuditSettingResponseBodyAuditRange setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public DescribeAuditSettingResponseBodyAuditRange setReview(Boolean review) {
            this.review = review;
            return this;
        }
        public Boolean getReview() {
            return this.review;
        }

    }

}
