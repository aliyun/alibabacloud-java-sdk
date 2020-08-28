// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteUserResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Errors")
    @Validation(required = true)
    public java.util.List<DeleteUserResponseErrors> errors;

    public static DeleteUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserResponse self = new DeleteUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteUserResponse setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public DeleteUserResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserResponse setErrors(java.util.List<DeleteUserResponseErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<DeleteUserResponseErrors> getErrors() {
        return this.errors;
    }

    public static class DeleteUserResponseErrors extends TeaModel {
        @NameInMap("Field")
        @Validation(required = true)
        public String field;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static DeleteUserResponseErrors build(java.util.Map<String, ?> map) throws Exception {
            DeleteUserResponseErrors self = new DeleteUserResponseErrors();
            return TeaModel.build(map, self);
        }

        public DeleteUserResponseErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DeleteUserResponseErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
