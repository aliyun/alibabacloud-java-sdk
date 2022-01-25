// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateWatermarkResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public UpdateWatermarkResponseBodyData data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<UpdateWatermarkResponseBodyErrors> errors;

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

    public static UpdateWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkResponseBody self = new UpdateWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWatermarkResponseBody setData(UpdateWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWatermarkResponseBodyData getData() {
        return this.data;
    }

    public UpdateWatermarkResponseBody setErrors(java.util.List<UpdateWatermarkResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<UpdateWatermarkResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public UpdateWatermarkResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateWatermarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWatermarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateWatermarkResponseBodyData extends TeaModel {
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

        public static UpdateWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkResponseBodyData self = new UpdateWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWatermarkResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateWatermarkResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWatermarkResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWatermarkResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateWatermarkResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static UpdateWatermarkResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkResponseBodyErrors self = new UpdateWatermarkResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public UpdateWatermarkResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateWatermarkResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
