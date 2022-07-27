// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCustomFieldOptionResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("fileds")
    public java.util.List<GetCustomFieldOptionResponseBodyFileds> fileds;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetCustomFieldOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldOptionResponseBody self = new GetCustomFieldOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldOptionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCustomFieldOptionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetCustomFieldOptionResponseBody setFileds(java.util.List<GetCustomFieldOptionResponseBodyFileds> fileds) {
        this.fileds = fileds;
        return this;
    }
    public java.util.List<GetCustomFieldOptionResponseBodyFileds> getFileds() {
        return this.fileds;
    }

    public GetCustomFieldOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomFieldOptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomFieldOptionResponseBodyFileds extends TeaModel {
        @NameInMap("displayValue")
        public String displayValue;

        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("level")
        public Long level;

        @NameInMap("position")
        public Long position;

        @NameInMap("value")
        public String value;

        @NameInMap("valueEn")
        public String valueEn;

        public static GetCustomFieldOptionResponseBodyFileds build(java.util.Map<String, ?> map) throws Exception {
            GetCustomFieldOptionResponseBodyFileds self = new GetCustomFieldOptionResponseBodyFileds();
            return TeaModel.build(map, self);
        }

        public GetCustomFieldOptionResponseBodyFileds setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public GetCustomFieldOptionResponseBodyFileds setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public GetCustomFieldOptionResponseBodyFileds setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetCustomFieldOptionResponseBodyFileds setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetCustomFieldOptionResponseBodyFileds setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public GetCustomFieldOptionResponseBodyFileds setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetCustomFieldOptionResponseBodyFileds setValueEn(String valueEn) {
            this.valueEn = valueEn;
            return this;
        }
        public String getValueEn() {
            return this.valueEn;
        }

    }

}
