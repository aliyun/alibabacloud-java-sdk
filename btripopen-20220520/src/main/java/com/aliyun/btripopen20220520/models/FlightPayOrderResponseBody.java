// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightPayOrderResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
     * <p>210e842b16611337974412836dae27</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightPayOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderResponseBody self = new FlightPayOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightPayOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightPayOrderResponseBody setModule(FlightPayOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightPayOrderResponseBodyModule getModule() {
        return this.module;
    }

    public FlightPayOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightPayOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightPayOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightPayOrderResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("actual_pay_price")
        public Long actualPayPrice;

        /**
         * <strong>example:</strong>
         * <p>12989127316726531726</p>
         */
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>0000-00-00 00:00:00</p>
         */
        @NameInMap("last_pay_time")
        public String lastPayTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        public static FlightPayOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightPayOrderResponseBodyModule self = new FlightPayOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightPayOrderResponseBodyModule setActualPayPrice(Long actualPayPrice) {
            this.actualPayPrice = actualPayPrice;
            return this;
        }
        public Long getActualPayPrice() {
            return this.actualPayPrice;
        }

        public FlightPayOrderResponseBodyModule setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FlightPayOrderResponseBodyModule setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public FlightPayOrderResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

    }

}
