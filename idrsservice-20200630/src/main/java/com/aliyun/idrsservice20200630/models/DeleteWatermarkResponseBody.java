// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteWatermarkResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteWatermarkResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<DeleteWatermarkResponseBodyErrors> errors;

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

    public static DeleteWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkResponseBody self = new DeleteWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteWatermarkResponseBody setData(DeleteWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteWatermarkResponseBodyData getData() {
        return this.data;
    }

    public DeleteWatermarkResponseBody setErrors(java.util.List<DeleteWatermarkResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<DeleteWatermarkResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public DeleteWatermarkResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public DeleteWatermarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWatermarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteWatermarkResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DeleteWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteWatermarkResponseBodyData self = new DeleteWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteWatermarkResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteWatermarkResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteWatermarkResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteWatermarkResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DeleteWatermarkResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static DeleteWatermarkResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            DeleteWatermarkResponseBodyErrors self = new DeleteWatermarkResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public DeleteWatermarkResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DeleteWatermarkResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
