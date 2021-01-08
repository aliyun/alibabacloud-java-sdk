// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeRuleResponseBodyResult result;

    public static DescribeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleResponseBody self = new DescribeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleResponseBody setResult(DescribeRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeRuleResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleResponseBodyResult self = new DescribeRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRuleResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleResponseBodyResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
