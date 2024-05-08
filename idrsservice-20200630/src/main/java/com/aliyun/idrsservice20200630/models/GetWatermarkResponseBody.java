// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetWatermarkResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWatermarkResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<GetWatermarkResponseBodyErrors> errors;

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
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

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
