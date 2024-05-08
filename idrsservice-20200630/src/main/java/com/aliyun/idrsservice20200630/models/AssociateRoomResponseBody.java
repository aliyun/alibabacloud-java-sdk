// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AssociateRoomResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Errors")
    public java.util.List<AssociateRoomResponseBodyErrors> errors;

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

    public static AssociateRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateRoomResponseBody self = new AssociateRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateRoomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssociateRoomResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AssociateRoomResponseBody setErrors(java.util.List<AssociateRoomResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<AssociateRoomResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public AssociateRoomResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public AssociateRoomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssociateRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateRoomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AssociateRoomResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static AssociateRoomResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            AssociateRoomResponseBodyErrors self = new AssociateRoomResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public AssociateRoomResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public AssociateRoomResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
