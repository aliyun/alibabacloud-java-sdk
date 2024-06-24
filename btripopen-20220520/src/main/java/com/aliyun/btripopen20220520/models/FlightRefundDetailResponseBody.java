// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightRefundDetailResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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

    public static FlightRefundDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundDetailResponseBody self = new FlightRefundDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightRefundDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightRefundDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightRefundDetailResponseBody setModule(FlightRefundDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightRefundDetailResponseBodyModule getModule() {
        return this.module;
    }

    public FlightRefundDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightRefundDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightRefundDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightRefundDetailResponseBodyModuleRefundFeeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>293982882881999</p>
         */
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_fee")
        public Long refundFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        @NameInMap("status")
        public String status;

        public static FlightRefundDetailResponseBodyModuleRefundFeeList build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailResponseBodyModuleRefundFeeList self = new FlightRefundDetailResponseBodyModuleRefundFeeList();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailResponseBodyModuleRefundFeeList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FlightRefundDetailResponseBodyModuleRefundFeeList setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public FlightRefundDetailResponseBodyModuleRefundFeeList setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public FlightRefundDetailResponseBodyModuleRefundFeeList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class FlightRefundDetailResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("btrip_sub_order_id")
        public Long btripSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>dis1234</p>
         */
        @NameInMap("dis_order_id")
        public String disOrderId;

        /**
         * <strong>example:</strong>
         * <p>refun123</p>
         */
        @NameInMap("dis_sub_order_id")
        public String disSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("is_voluntary")
        public Integer isVoluntary;

        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_fee")
        public Long refundFee;

        @NameInMap("refund_fee_list")
        public java.util.List<FlightRefundDetailResponseBodyModuleRefundFeeList> refundFeeList;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public String status;

        public static FlightRefundDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailResponseBodyModule self = new FlightRefundDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailResponseBodyModule setBtripOrderId(Long btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        public FlightRefundDetailResponseBodyModule setBtripSubOrderId(Long btripSubOrderId) {
            this.btripSubOrderId = btripSubOrderId;
            return this;
        }
        public Long getBtripSubOrderId() {
            return this.btripSubOrderId;
        }

        public FlightRefundDetailResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public FlightRefundDetailResponseBodyModule setDisSubOrderId(String disSubOrderId) {
            this.disSubOrderId = disSubOrderId;
            return this;
        }
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        public FlightRefundDetailResponseBodyModule setIsVoluntary(Integer isVoluntary) {
            this.isVoluntary = isVoluntary;
            return this;
        }
        public Integer getIsVoluntary() {
            return this.isVoluntary;
        }

        public FlightRefundDetailResponseBodyModule setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public FlightRefundDetailResponseBodyModule setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public FlightRefundDetailResponseBodyModule setRefundFeeList(java.util.List<FlightRefundDetailResponseBodyModuleRefundFeeList> refundFeeList) {
            this.refundFeeList = refundFeeList;
            return this;
        }
        public java.util.List<FlightRefundDetailResponseBodyModuleRefundFeeList> getRefundFeeList() {
            return this.refundFeeList;
        }

        public FlightRefundDetailResponseBodyModule setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public FlightRefundDetailResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
