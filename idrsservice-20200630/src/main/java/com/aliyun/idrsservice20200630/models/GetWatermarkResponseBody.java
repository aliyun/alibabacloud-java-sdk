// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetWatermarkResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public GetWatermarkResponseBodyData data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<GetWatermarkResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 提示
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static GetWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponseBody self = new GetWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWatermarkResponseBody setData(GetWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWatermarkResponseBodyData getData() {
        return this.data;
    }

    public GetWatermarkResponseBody setErrors(java.util.List<GetWatermarkResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetWatermarkResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetWatermarkResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetWatermarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWatermarkResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("CreatedAt")
        public String createdAt;

        // 水印id
        @NameInMap("Id")
        public String id;

        // 水印名称
        @NameInMap("Name")
        public String name;

        // 水印信息
        @NameInMap("Value")
        public String value;

        public static GetWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseBodyData self = new GetWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWatermarkResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetWatermarkResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWatermarkResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarkResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetWatermarkResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static GetWatermarkResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseBodyErrors self = new GetWatermarkResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetWatermarkResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetWatermarkResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
