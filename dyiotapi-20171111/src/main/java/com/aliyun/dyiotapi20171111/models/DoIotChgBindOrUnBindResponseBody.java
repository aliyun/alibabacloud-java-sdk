// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotChgBindOrUnBindResponseBody extends TeaModel {
    @NameInMap("IotModBind")
    public DoIotChgBindOrUnBindResponseBodyIotModBind iotModBind;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DoIotChgBindOrUnBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoIotChgBindOrUnBindResponseBody self = new DoIotChgBindOrUnBindResponseBody();
        return TeaModel.build(map, self);
    }

    public DoIotChgBindOrUnBindResponseBody setIotModBind(DoIotChgBindOrUnBindResponseBodyIotModBind iotModBind) {
        this.iotModBind = iotModBind;
        return this;
    }
    public DoIotChgBindOrUnBindResponseBodyIotModBind getIotModBind() {
        return this.iotModBind;
    }

    public DoIotChgBindOrUnBindResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoIotChgBindOrUnBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoIotChgBindOrUnBindResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DoIotChgBindOrUnBindResponseBodyIotModBind extends TeaModel {
        @NameInMap("IsModSuccess")
        public Boolean isModSuccess;

        public static DoIotChgBindOrUnBindResponseBodyIotModBind build(java.util.Map<String, ?> map) throws Exception {
            DoIotChgBindOrUnBindResponseBodyIotModBind self = new DoIotChgBindOrUnBindResponseBodyIotModBind();
            return TeaModel.build(map, self);
        }

        public DoIotChgBindOrUnBindResponseBodyIotModBind setIsModSuccess(Boolean isModSuccess) {
            this.isModSuccess = isModSuccess;
            return this;
        }
        public Boolean getIsModSuccess() {
            return this.isModSuccess;
        }

    }

}
