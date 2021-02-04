// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public ModifyInstanceResponseData data;

    public static ModifyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponse self = new ModifyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyInstanceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyInstanceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyInstanceResponse setData(ModifyInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public ModifyInstanceResponseData getData() {
        return this.data;
    }

    public static class ModifyInstanceResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        public static ModifyInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceResponseData self = new ModifyInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceResponseData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ModifyInstanceResponseData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
