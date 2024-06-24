// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightCreateOrderResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderResponseBody self = new FlightCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightCreateOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightCreateOrderResponseBody setModule(FlightCreateOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightCreateOrderResponseBodyModule getModule() {
        return this.module;
    }

    public FlightCreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightCreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightCreateOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightCreateOrderResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3287177727711</p>
         */
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        /**
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        @NameInMap("dis_order_id")
        public String disOrderId;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("last_pay_time")
        public String lastPayTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("payment_price")
        public Long paymentPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        public static FlightCreateOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightCreateOrderResponseBodyModule self = new FlightCreateOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightCreateOrderResponseBodyModule setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FlightCreateOrderResponseBodyModule setBtripOrderId(Long btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        public FlightCreateOrderResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public FlightCreateOrderResponseBodyModule setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public FlightCreateOrderResponseBodyModule setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public FlightCreateOrderResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public FlightCreateOrderResponseBodyModule setPaymentPrice(Long paymentPrice) {
            this.paymentPrice = paymentPrice;
            return this;
        }
        public Long getPaymentPrice() {
            return this.paymentPrice;
        }

        public FlightCreateOrderResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

    }

}
