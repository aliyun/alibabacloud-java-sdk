// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractResultGenerationResponseBody extends TeaModel {
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
    public RunContractResultGenerationResponseBodyOutput output;

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
    public RunContractResultGenerationResponseBodyUsage usage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    public static RunContractResultGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunContractResultGenerationResponseBody self = new RunContractResultGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunContractResultGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunContractResultGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunContractResultGenerationResponseBody setOutput(RunContractResultGenerationResponseBodyOutput output) {
        this.output = output;
        return this;
    }
    public RunContractResultGenerationResponseBodyOutput getOutput() {
        return this.output;
    }

    public RunContractResultGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunContractResultGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunContractResultGenerationResponseBody setUsage(RunContractResultGenerationResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public RunContractResultGenerationResponseBodyUsage getUsage() {
        return this.usage;
    }

    public RunContractResultGenerationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static class RunContractResultGenerationResponseBodyOutputResultSubRisks extends TeaModel {
        @NameInMap("originalContent")
        public String originalContent;

        @NameInMap("resultContent")
        public String resultContent;

        @NameInMap("resultType")
        public String resultType;

        @NameInMap("riskBrief")
        public String riskBrief;

        @NameInMap("riskClause")
        public String riskClause;

        @NameInMap("riskExplain")
        public String riskExplain;

        public static RunContractResultGenerationResponseBodyOutputResultSubRisks build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationResponseBodyOutputResultSubRisks self = new RunContractResultGenerationResponseBodyOutputResultSubRisks();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationResponseBodyOutputResultSubRisks setOriginalContent(String originalContent) {
            this.originalContent = originalContent;
            return this;
        }
        public String getOriginalContent() {
            return this.originalContent;
        }

        public RunContractResultGenerationResponseBodyOutputResultSubRisks setResultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }
        public String getResultContent() {
            return this.resultContent;
        }

        public RunContractResultGenerationResponseBodyOutputResultSubRisks setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

        public RunContractResultGenerationResponseBodyOutputResultSubRisks setRiskBrief(String riskBrief) {
            this.riskBrief = riskBrief;
            return this;
        }
        public String getRiskBrief() {
            return this.riskBrief;
        }

        public RunContractResultGenerationResponseBodyOutputResultSubRisks setRiskClause(String riskClause) {
            this.riskClause = riskClause;
            return this;
        }
        public String getRiskClause() {
            return this.riskClause;
        }

        public RunContractResultGenerationResponseBodyOutputResultSubRisks setRiskExplain(String riskExplain) {
            this.riskExplain = riskExplain;
            return this;
        }
        public String getRiskExplain() {
            return this.riskExplain;
        }

    }

    public static class RunContractResultGenerationResponseBodyOutputResult extends TeaModel {
        @NameInMap("examineBrief")
        public String examineBrief;

        @NameInMap("examineResult")
        public String examineResult;

        /**
         * <strong>example:</strong>
         * <p>high</p>
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

        @NameInMap("subRisks")
        public java.util.List<RunContractResultGenerationResponseBodyOutputResultSubRisks> subRisks;

        public static RunContractResultGenerationResponseBodyOutputResult build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationResponseBodyOutputResult self = new RunContractResultGenerationResponseBodyOutputResult();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationResponseBodyOutputResult setExamineBrief(String examineBrief) {
            this.examineBrief = examineBrief;
            return this;
        }
        public String getExamineBrief() {
            return this.examineBrief;
        }

        public RunContractResultGenerationResponseBodyOutputResult setExamineResult(String examineResult) {
            this.examineResult = examineResult;
            return this;
        }
        public String getExamineResult() {
            return this.examineResult;
        }

        public RunContractResultGenerationResponseBodyOutputResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public RunContractResultGenerationResponseBodyOutputResult setRuleSequence(String ruleSequence) {
            this.ruleSequence = ruleSequence;
            return this;
        }
        public String getRuleSequence() {
            return this.ruleSequence;
        }

        public RunContractResultGenerationResponseBodyOutputResult setRuleTag(String ruleTag) {
            this.ruleTag = ruleTag;
            return this;
        }
        public String getRuleTag() {
            return this.ruleTag;
        }

        public RunContractResultGenerationResponseBodyOutputResult setRuleTitle(String ruleTitle) {
            this.ruleTitle = ruleTitle;
            return this;
        }
        public String getRuleTitle() {
            return this.ruleTitle;
        }

        public RunContractResultGenerationResponseBodyOutputResult setSubRisks(java.util.List<RunContractResultGenerationResponseBodyOutputResultSubRisks> subRisks) {
            this.subRisks = subRisks;
            return this;
        }
        public java.util.List<RunContractResultGenerationResponseBodyOutputResultSubRisks> getSubRisks() {
            return this.subRisks;
        }

    }

    public static class RunContractResultGenerationResponseBodyOutput extends TeaModel {
        @NameInMap("result")
        public RunContractResultGenerationResponseBodyOutputResult result;

        /**
         * <strong>example:</strong>
         * <p>eaa56e1e-e205-4f5e-926e-5e2269ae7f68</p>
         */
        @NameInMap("resultTaskId")
        public String resultTaskId;

        public static RunContractResultGenerationResponseBodyOutput build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationResponseBodyOutput self = new RunContractResultGenerationResponseBodyOutput();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationResponseBodyOutput setResult(RunContractResultGenerationResponseBodyOutputResult result) {
            this.result = result;
            return this;
        }
        public RunContractResultGenerationResponseBodyOutputResult getResult() {
            return this.result;
        }

        public RunContractResultGenerationResponseBodyOutput setResultTaskId(String resultTaskId) {
            this.resultTaskId = resultTaskId;
            return this;
        }
        public String getResultTaskId() {
            return this.resultTaskId;
        }

    }

    public static class RunContractResultGenerationResponseBodyUsage extends TeaModel {
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

        public static RunContractResultGenerationResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            RunContractResultGenerationResponseBodyUsage self = new RunContractResultGenerationResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public RunContractResultGenerationResponseBodyUsage setInput(Long input) {
            this.input = input;
            return this;
        }
        public Long getInput() {
            return this.input;
        }

        public RunContractResultGenerationResponseBodyUsage setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
