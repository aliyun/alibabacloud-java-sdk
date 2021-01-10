// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteUserResponseBody extends TeaModel {
    @NameInMap("Errors")
    public java.util.List<DeleteUserResponseBodyErrors> errors;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Code")
    public String code;

    public static DeleteUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserResponseBody self = new DeleteUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserResponseBody setErrors(java.util.List<DeleteUserResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<DeleteUserResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public DeleteUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public DeleteUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeleteUserResponseBodyErrors extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Field")
        public String field;

        public static DeleteUserResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            DeleteUserResponseBodyErrors self = new DeleteUserResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public DeleteUserResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteUserResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

}
