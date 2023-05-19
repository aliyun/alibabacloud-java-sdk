// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ConvertChargeTypeResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConvertChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertChargeTypeResponseBody self = new ConvertChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertChargeTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConvertChargeTypeResponseBody setData(ConvertChargeTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConvertChargeTypeResponseBodyData getData() {
        return this.data;
    }

    public ConvertChargeTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class ConvertChargeTypeResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the order.</p>
         */
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
