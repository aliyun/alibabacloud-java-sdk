// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCustomFieldOptionResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 字段值信息
    @NameInMap("fileds")
    public java.util.List<GetCustomFieldOptionResponseBodyFileds> fileds;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
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
        // 展示的值
        @NameInMap("displayValue")
        public String displayValue;

        // 字段唯一标识
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        // 迭代唯一标识符
        @NameInMap("identifier")
        public String identifier;

        // 展示级别，数字范围1~9，数字越大，颜色越浅
        @NameInMap("level")
        public Long level;

        // 待选值顺序
        @NameInMap("position")
        public Long position;

        // 字段中文名称
        @NameInMap("value")
        public String value;

        // 字段英文名称
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
