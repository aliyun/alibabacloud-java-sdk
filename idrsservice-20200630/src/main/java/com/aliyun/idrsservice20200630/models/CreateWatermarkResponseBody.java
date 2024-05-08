// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateWatermarkResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateWatermarkResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<CreateWatermarkResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkResponseBody self = new CreateWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWatermarkResponseBody setData(CreateWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWatermarkResponseBodyData getData() {
        return this.data;
    }

    public CreateWatermarkResponseBody setErrors(java.util.List<CreateWatermarkResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<CreateWatermarkResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public CreateWatermarkResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateWatermarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWatermarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWatermarkResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWatermarkResponseBodyData self = new CreateWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWatermarkResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateWatermarkResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateWatermarkResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWatermarkResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateWatermarkResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static CreateWatermarkResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            CreateWatermarkResponseBodyErrors self = new CreateWatermarkResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public CreateWatermarkResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateWatermarkResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
