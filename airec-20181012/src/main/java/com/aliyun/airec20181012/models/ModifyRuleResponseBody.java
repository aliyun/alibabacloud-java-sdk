// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyRuleResponseBodyResult result;

    public static ModifyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleResponseBody self = new ModifyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRuleResponseBody setResult(ModifyRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyRuleResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("RuleMeta")
        public java.util.Map<String, ?> ruleMeta;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("RuleId")
        public String ruleId;

        public static ModifyRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyRuleResponseBodyResult self = new ModifyRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyRuleResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyRuleResponseBodyResult setRuleMeta(java.util.Map<String, ?> ruleMeta) {
            this.ruleMeta = ruleMeta;
            return this;
        }
        public java.util.Map<String, ?> getRuleMeta() {
            return this.ruleMeta;
        }

        public ModifyRuleResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyRuleResponseBodyResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
