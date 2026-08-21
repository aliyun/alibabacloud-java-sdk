// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryRefundOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketQueryRefundOrderResponseBodyData data;

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

    public static TicketQueryRefundOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryRefundOrderResponseBody self = new TicketQueryRefundOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketQueryRefundOrderResponseBody setData(TicketQueryRefundOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketQueryRefundOrderResponseBodyData getData() {
        return this.data;
    }

    public TicketQueryRefundOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketQueryRefundOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketQueryRefundOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketQueryRefundOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketQueryRefundOrderResponseBodyDataRefundOrders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FundStatus")
        public Integer fundStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderStatus")
        public Integer orderStatus;

        public static TicketQueryRefundOrderResponseBodyDataRefundOrders build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryRefundOrderResponseBodyDataRefundOrders self = new TicketQueryRefundOrderResponseBodyDataRefundOrders();
            return TeaModel.build(map, self);
        }

        public TicketQueryRefundOrderResponseBodyDataRefundOrders setFundStatus(Integer fundStatus) {
            this.fundStatus = fundStatus;
            return this;
        }
        public Integer getFundStatus() {
            return this.fundStatus;
        }

        public TicketQueryRefundOrderResponseBodyDataRefundOrders setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

    }

    public static class TicketQueryRefundOrderResponseBodyData extends TeaModel {
        @NameInMap("RefundOrders")
        public java.util.List<TicketQueryRefundOrderResponseBodyDataRefundOrders> refundOrders;

        public static TicketQueryRefundOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryRefundOrderResponseBodyData self = new TicketQueryRefundOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketQueryRefundOrderResponseBodyData setRefundOrders(java.util.List<TicketQueryRefundOrderResponseBodyDataRefundOrders> refundOrders) {
            this.refundOrders = refundOrders;
            return this;
        }
        public java.util.List<TicketQueryRefundOrderResponseBodyDataRefundOrders> getRefundOrders() {
            return this.refundOrders;
        }

    }

}
