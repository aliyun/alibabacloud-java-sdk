// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public ConvertChargeTypeResponseBodyData data;

    public static ConvertChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertChargeTypeResponseBody self = new ConvertChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertChargeTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConvertChargeTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConvertChargeTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConvertChargeTypeResponseBody setData(ConvertChargeTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConvertChargeTypeResponseBodyData getData() {
        return this.data;
    }

    public static class ConvertChargeTypeResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public String orderId;

        public static ConvertChargeTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConvertChargeTypeResponseBodyData self = new ConvertChargeTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConvertChargeTypeResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
