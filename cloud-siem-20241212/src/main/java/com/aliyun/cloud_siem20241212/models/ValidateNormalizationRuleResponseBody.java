// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ValidateNormalizationRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of validation results.</p>
     */
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
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The field value.</p>
         * 
         * <strong>example:</strong>
         * <p>ze</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The name of the log field.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("LogFieldName")
        public String logFieldName;

        /**
         * <p>The value of the log field.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb</p>
         */
        @NameInMap("LogFieldValue")
        public String logFieldValue;

        /**
         * <p>The reason for the validation result. Valid values:</p>
         * <ul>
         * <li><p>OperationDenied.TheValueIsRequired: A required parameter is empty.</p>
         * </li>
         * <li><p>OperationDenied.TheValueIsNull: The parameter value is empty.</p>
         * </li>
         * <li><p>OperationDenied.TheEnumValueNotSupport: The field value is not within the valid enumeration.</p>
         * </li>
         * <li><p>OperationDenied.TheValueLessThanMin: The field value is less than the minimum value.</p>
         * </li>
         * <li><p>OperationDenied.TheValueMoreThanMax: The field value is greater than the maximum value.</p>
         * </li>
         * <li><p>OperationDenied.TheValueNotMatchRegularExpression: The field value does not match the regular expression.</p>
         * </li>
         * <li><p>success: The validation passed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The source of the normalized field. Valid values: \<code>preset\\</code> (built-in) and \<code>custom\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>The name of the normalized field.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Indicates whether the normalized field is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <p>Indicates whether the name of the normalized field is a built-in field name.</p>
         */
        @NameInMap("NormalizationFieldReserved")
        public Boolean normalizationFieldReserved;

        /**
         * <p>The type of the normalized field. Supported types: \<code>text\\</code>, \<code>long\\</code>, \<code>double\\</code>, and \<code>json\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        /**
         * <p>The reason why the validation of the normalized field failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationDenied.TheValueIsRequired</p>
         */
        @NameInMap("NormalizationFieldValidationReason")
        public String normalizationFieldValidationReason;

        /**
         * <p>The validation status of the normalized field. Valid values: \<code>pass\\</code> and \<code>fail\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("NormalizationFieldValidationStatus")
        public String normalizationFieldValidationStatus;

        /**
         * <p>The result of the validation. Valid values:</p>
         * <ul>
         * <li><p>1: The validation passed.</p>
         * </li>
         * <li><p>0: A warning is returned.</p>
         * </li>
         * <li><p>-1: The validation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
