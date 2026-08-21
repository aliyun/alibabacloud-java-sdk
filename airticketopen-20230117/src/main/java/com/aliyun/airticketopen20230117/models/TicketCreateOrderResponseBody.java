// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCreateOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketCreateOrderResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DistributorOrderIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>分销商订单号不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketCreateOrderResponseBody self = new TicketCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketCreateOrderResponseBody setData(TicketCreateOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketCreateOrderResponseBodyData getData() {
        return this.data;
    }

    public TicketCreateOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketCreateOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketCreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketCreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketCreateOrderResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static TicketCreateOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketCreateOrderResponseBodyData self = new TicketCreateOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketCreateOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
