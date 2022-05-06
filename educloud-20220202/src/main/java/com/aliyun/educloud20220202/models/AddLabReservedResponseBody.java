// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class AddLabReservedResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public AddLabReservedResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddLabReservedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLabReservedResponseBody self = new AddLabReservedResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLabReservedResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddLabReservedResponseBody setData(AddLabReservedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddLabReservedResponseBodyData getData() {
        return this.data;
    }

    public AddLabReservedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLabReservedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLabReservedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddLabReservedResponseBodyData extends TeaModel {
        @NameInMap("ReservedId")
        public String reservedId;

        public static AddLabReservedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddLabReservedResponseBodyData self = new AddLabReservedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddLabReservedResponseBodyData setReservedId(String reservedId) {
            this.reservedId = reservedId;
            return this;
        }
        public String getReservedId() {
            return this.reservedId;
        }

    }

}
