// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ValidateNormalizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ValidateResult")
    public java.util.List<ValidateNormalizationRuleResponseBodyValidateResult> validateResult;

    public static ValidateNormalizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateNormalizationRuleResponseBody self = new ValidateNormalizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateNormalizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateNormalizationRuleResponseBody setValidateResult(java.util.List<ValidateNormalizationRuleResponseBodyValidateResult> validateResult) {
        this.validateResult = validateResult;
        return this;
    }
    public java.util.List<ValidateNormalizationRuleResponseBodyValidateResult> getValidateResult() {
        return this.validateResult;
    }

    public static class ValidateNormalizationRuleResponseBodyValidateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>host。</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>ze。</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <strong>example:</strong>
         * <p>success。</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>host。</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <strong>example:</strong>
         * <p>1。</p>
         */
        @NameInMap("Result")
        public Integer result;

        public static ValidateNormalizationRuleResponseBodyValidateResult build(java.util.Map<String, ?> map) throws Exception {
            ValidateNormalizationRuleResponseBodyValidateResult self = new ValidateNormalizationRuleResponseBodyValidateResult();
            return TeaModel.build(map, self);
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

    }

}
