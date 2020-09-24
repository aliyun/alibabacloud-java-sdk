// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeResponse extends TeaModel {
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
    public ConvertChargeTypeResponseData data;

    public static ConvertChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertChargeTypeResponse self = new ConvertChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ConvertChargeTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertChargeTypeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConvertChargeTypeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConvertChargeTypeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConvertChargeTypeResponse setData(ConvertChargeTypeResponseData data) {
        this.data = data;
        return this;
    }
    public ConvertChargeTypeResponseData getData() {
        return this.data;
    }

    public static class ConvertChargeTypeResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        public static ConvertChargeTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ConvertChargeTypeResponseData self = new ConvertChargeTypeResponseData();
            return TeaModel.build(map, self);
        }

        public ConvertChargeTypeResponseData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
