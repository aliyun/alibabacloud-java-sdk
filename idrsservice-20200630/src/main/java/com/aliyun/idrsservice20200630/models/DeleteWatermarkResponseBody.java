// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteWatermarkResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public DeleteWatermarkResponseBodyData data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<DeleteWatermarkResponseBodyErrors> errors;

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
