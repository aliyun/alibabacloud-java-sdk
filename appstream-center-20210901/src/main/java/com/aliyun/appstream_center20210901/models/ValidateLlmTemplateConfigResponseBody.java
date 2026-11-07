// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ValidateLlmTemplateConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateLlmTemplateConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateLlmTemplateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateLlmTemplateConfigResponseBody self = new ValidateLlmTemplateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateLlmTemplateConfigResponseBody setData(ValidateLlmTemplateConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateLlmTemplateConfigResponseBodyData getData() {
        return this.data;
    }

    public ValidateLlmTemplateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateLlmTemplateConfigResponseBodyDataValidationErrors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UNKNOWN_FIELD</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>unknownField</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>Unknown field &quot;unknownField&quot; is not recognized by Agent and will be ignored.</p>
         */
        @NameInMap("Message")
        public String message;

        public static ValidateLlmTemplateConfigResponseBodyDataValidationErrors build(java.util.Map<String, ?> map) throws Exception {
            ValidateLlmTemplateConfigResponseBodyDataValidationErrors self = new ValidateLlmTemplateConfigResponseBodyDataValidationErrors();
            return TeaModel.build(map, self);
        }

        public ValidateLlmTemplateConfigResponseBodyDataValidationErrors setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ValidateLlmTemplateConfigResponseBodyDataValidationErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ValidateLlmTemplateConfigResponseBodyDataValidationErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ValidateLlmTemplateConfigResponseBodyData extends TeaModel {
        @NameInMap("Valid")
        public Boolean valid;

        @NameInMap("ValidationErrors")
        public java.util.List<ValidateLlmTemplateConfigResponseBodyDataValidationErrors> validationErrors;

        public static ValidateLlmTemplateConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateLlmTemplateConfigResponseBodyData self = new ValidateLlmTemplateConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateLlmTemplateConfigResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

        public ValidateLlmTemplateConfigResponseBodyData setValidationErrors(java.util.List<ValidateLlmTemplateConfigResponseBodyDataValidationErrors> validationErrors) {
            this.validationErrors = validationErrors;
            return this;
        }
        public java.util.List<ValidateLlmTemplateConfigResponseBodyDataValidationErrors> getValidationErrors() {
            return this.validationErrors;
        }

    }

}
