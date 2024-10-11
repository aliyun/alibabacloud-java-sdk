// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRuleResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public ModifyRuleResponseBodyResult result;

    public static ModifyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleResponseBody self = new ModifyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>98493A14-D619-4E88-9F8D-108939817F9F</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The specific information about the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ruleMeta")
        public java.util.Map<String, ?> ruleMeta;

        /**
         * <p>Indicates whether the rule is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("status")
        public String status;

        public static ModifyRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyRuleResponseBodyResult self = new ModifyRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
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

        public ModifyRuleResponseBodyResult setRuleMeta(java.util.Map<String, ?> ruleMeta) {
            this.ruleMeta = ruleMeta;
            return this;
        }
        public java.util.Map<String, ?> getRuleMeta() {
            return this.ruleMeta;
        }

        public ModifyRuleResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
