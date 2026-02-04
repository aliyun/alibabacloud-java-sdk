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
         * <p>aaa</p>
         */
        @NameInMap("LogFieldName")
        public String logFieldName;

        /**
         * <strong>example:</strong>
         * <p>bbb</p>
         */
        @NameInMap("LogFieldValue")
        public String logFieldValue;

        /**
         * <strong>example:</strong>
         * <p>success。</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

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

        @NameInMap("NormalizationFieldReserved")
        public Boolean normalizationFieldReserved;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        /**
         * <strong>example:</strong>
         * <p>OperationDenied.TheValueIsRequired</p>
         */
        @NameInMap("NormalizationFieldValidationReason")
        public String normalizationFieldValidationReason;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("NormalizationFieldValidationStatus")
        public String normalizationFieldValidationStatus;

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

        public ValidateNormalizationRuleResponseBodyValidateResult setLogFieldName(String logFieldName) {
            this.logFieldName = logFieldName;
            return this;
        }
        public String getLogFieldName() {
            return this.logFieldName;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setLogFieldValue(String logFieldValue) {
            this.logFieldValue = logFieldValue;
            return this;
        }
        public String getLogFieldValue() {
            return this.logFieldValue;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
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

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldReserved(Boolean normalizationFieldReserved) {
            this.normalizationFieldReserved = normalizationFieldReserved;
            return this;
        }
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldValidationReason(String normalizationFieldValidationReason) {
            this.normalizationFieldValidationReason = normalizationFieldValidationReason;
            return this;
        }
        public String getNormalizationFieldValidationReason() {
            return this.normalizationFieldValidationReason;
        }

        public ValidateNormalizationRuleResponseBodyValidateResult setNormalizationFieldValidationStatus(String normalizationFieldValidationStatus) {
            this.normalizationFieldValidationStatus = normalizationFieldValidationStatus;
            return this;
        }
        public String getNormalizationFieldValidationStatus() {
            return this.normalizationFieldValidationStatus;
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
