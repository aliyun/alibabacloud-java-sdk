// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractRuleGenerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Output")
    public RunContractRuleGenerationResponseBodyOutput output;

    /**
     * <strong>example:</strong>
     * <p>744419D0-671A-5997-9840-E8AE48356194</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Usage")
    public RunContractRuleGenerationResponseBodyUsage usage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    public static RunContractRuleGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunContractRuleGenerationResponseBody self = new RunContractRuleGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunContractRuleGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunContractRuleGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunContractRuleGenerationResponseBody setOutput(RunContractRuleGenerationResponseBodyOutput output) {
        this.output = output;
        return this;
    }
    public RunContractRuleGenerationResponseBodyOutput getOutput() {
        return this.output;
    }

    public RunContractRuleGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunContractRuleGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunContractRuleGenerationResponseBody setUsage(RunContractRuleGenerationResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public RunContractRuleGenerationResponseBodyUsage getUsage() {
        return this.usage;
    }

    public RunContractRuleGenerationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static class RunContractRuleGenerationResponseBodyOutputRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        @NameInMap("ruleSequence")
        public String ruleSequence;

        @NameInMap("ruleTag")
        public String ruleTag;

        @NameInMap("ruleTitle")
        public String ruleTitle;

        public static RunContractRuleGenerationResponseBodyOutputRules build(java.util.Map<String, ?> map) throws Exception {
            RunContractRuleGenerationResponseBodyOutputRules self = new RunContractRuleGenerationResponseBodyOutputRules();
            return TeaModel.build(map, self);
        }

        public RunContractRuleGenerationResponseBodyOutputRules setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public RunContractRuleGenerationResponseBodyOutputRules setRuleSequence(String ruleSequence) {
            this.ruleSequence = ruleSequence;
            return this;
        }
        public String getRuleSequence() {
            return this.ruleSequence;
        }

        public RunContractRuleGenerationResponseBodyOutputRules setRuleTag(String ruleTag) {
            this.ruleTag = ruleTag;
            return this;
        }
        public String getRuleTag() {
            return this.ruleTag;
        }

        public RunContractRuleGenerationResponseBodyOutputRules setRuleTitle(String ruleTitle) {
            this.ruleTitle = ruleTitle;
            return this;
        }
        public String getRuleTitle() {
            return this.ruleTitle;
        }

    }

    public static class RunContractRuleGenerationResponseBodyOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b265b416-ca1f-425d-9340-c968f39624e9</p>
         */
        @NameInMap("ruleTaskId")
        public String ruleTaskId;

        @NameInMap("rules")
        public java.util.List<RunContractRuleGenerationResponseBodyOutputRules> rules;

        public static RunContractRuleGenerationResponseBodyOutput build(java.util.Map<String, ?> map) throws Exception {
            RunContractRuleGenerationResponseBodyOutput self = new RunContractRuleGenerationResponseBodyOutput();
            return TeaModel.build(map, self);
        }

        public RunContractRuleGenerationResponseBodyOutput setRuleTaskId(String ruleTaskId) {
            this.ruleTaskId = ruleTaskId;
            return this;
        }
        public String getRuleTaskId() {
            return this.ruleTaskId;
        }

        public RunContractRuleGenerationResponseBodyOutput setRules(java.util.List<RunContractRuleGenerationResponseBodyOutputRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<RunContractRuleGenerationResponseBodyOutputRules> getRules() {
            return this.rules;
        }

    }

    public static class RunContractRuleGenerationResponseBodyUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("input")
        public Long input;

        /**
         * <strong>example:</strong>
         * <p>page</p>
         */
        @NameInMap("unit")
        public String unit;

        public static RunContractRuleGenerationResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            RunContractRuleGenerationResponseBodyUsage self = new RunContractRuleGenerationResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public RunContractRuleGenerationResponseBodyUsage setInput(Long input) {
            this.input = input;
            return this;
        }
        public Long getInput() {
            return this.input;
        }

        public RunContractRuleGenerationResponseBodyUsage setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
