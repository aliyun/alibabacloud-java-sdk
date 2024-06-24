// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingPayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingPayResponseBodyModule module;

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
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TicketChangingPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingPayResponseBody self = new TicketChangingPayResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingPayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingPayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingPayResponseBody setModule(TicketChangingPayResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingPayResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingPayResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingPayResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_retry")
        public Boolean canRetry;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("pay_price")
        public Long payPrice;

        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>0000-00-00 00:00:00</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>23098276578908765</p>
         */
        @NameInMap("trade_no")
        public String tradeNo;

        public static TicketChangingPayResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingPayResponseBodyModule self = new TicketChangingPayResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingPayResponseBodyModule setCanRetry(Boolean canRetry) {
            this.canRetry = canRetry;
            return this;
        }
        public Boolean getCanRetry() {
            return this.canRetry;
        }

        public TicketChangingPayResponseBodyModule setPayPrice(Long payPrice) {
            this.payPrice = payPrice;
            return this;
        }
        public Long getPayPrice() {
            return this.payPrice;
        }

        public TicketChangingPayResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public TicketChangingPayResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public TicketChangingPayResponseBodyModule setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

    }

}
