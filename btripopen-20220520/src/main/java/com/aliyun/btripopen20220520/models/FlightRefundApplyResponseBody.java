// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightRefundApplyResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightRefundApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyResponseBody self = new FlightRefundApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightRefundApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightRefundApplyResponseBody setModule(FlightRefundApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightRefundApplyResponseBodyModule getModule() {
        return this.module;
    }

    public FlightRefundApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightRefundApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightRefundApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightRefundApplyResponseBodyModule extends TeaModel {
        @NameInMap("dis_order_id")
        public String disOrderId;

        @NameInMap("dis_sub_order_id")
        public String disSubOrderId;

        @NameInMap("refund_apply_id")
        public Long refundApplyId;

        @NameInMap("refund_fee")
        public Long refundFee;

        @NameInMap("refund_money")
        public Long refundMoney;

        public static FlightRefundApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundApplyResponseBodyModule self = new FlightRefundApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightRefundApplyResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public FlightRefundApplyResponseBodyModule setDisSubOrderId(String disSubOrderId) {
            this.disSubOrderId = disSubOrderId;
            return this;
        }
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        public FlightRefundApplyResponseBodyModule setRefundApplyId(Long refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        public FlightRefundApplyResponseBodyModule setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public FlightRefundApplyResponseBodyModule setRefundMoney(Long refundMoney) {
            this.refundMoney = refundMoney;
            return this;
        }
        public Long getRefundMoney() {
            return this.refundMoney;
        }

    }

}
