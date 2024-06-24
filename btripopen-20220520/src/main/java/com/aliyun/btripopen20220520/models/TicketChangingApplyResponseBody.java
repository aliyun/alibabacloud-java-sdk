// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingApplyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingApplyResponseBodyModule module;

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

    public static TicketChangingApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingApplyResponseBody self = new TicketChangingApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingApplyResponseBody setModule(TicketChangingApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingApplyResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingApplyResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("booking_changed_total_fee")
        public Integer bookingChangedTotalFee;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("booking_origin_total_fee")
        public Integer bookingOriginTotalFee;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("booking_price_changed")
        public Boolean bookingPriceChanged;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("btrip_sub_order_id")
        public Long btripSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_pay")
        public Boolean canPay;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("change_fee")
        public Long changeFee;

        /**
         * <strong>example:</strong>
         * <p>0000-00-00 00:00:00</p>
         */
        @NameInMap("deadline_time")
        public String deadlineTime;

        /**
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        @NameInMap("dis_order_id")
        public String disOrderId;

        /**
         * <strong>example:</strong>
         * <p>mid112</p>
         */
        @NameInMap("dis_sub_order_id")
        public String disSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_retry_times")
        public Integer maxRetryTimes;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("next_retry_interval")
        public Long nextRetryInterval;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("retry")
        public Boolean retry;

        @NameInMap("retry_client_tips")
        public String retryClientTips;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("upgrade_fee")
        public Long upgradeFee;

        public static TicketChangingApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingApplyResponseBodyModule self = new TicketChangingApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingApplyResponseBodyModule setBookingChangedTotalFee(Integer bookingChangedTotalFee) {
            this.bookingChangedTotalFee = bookingChangedTotalFee;
            return this;
        }
        public Integer getBookingChangedTotalFee() {
            return this.bookingChangedTotalFee;
        }

        public TicketChangingApplyResponseBodyModule setBookingOriginTotalFee(Integer bookingOriginTotalFee) {
            this.bookingOriginTotalFee = bookingOriginTotalFee;
            return this;
        }
        public Integer getBookingOriginTotalFee() {
            return this.bookingOriginTotalFee;
        }

        public TicketChangingApplyResponseBodyModule setBookingPriceChanged(Boolean bookingPriceChanged) {
            this.bookingPriceChanged = bookingPriceChanged;
            return this;
        }
        public Boolean getBookingPriceChanged() {
            return this.bookingPriceChanged;
        }

        public TicketChangingApplyResponseBodyModule setBtripOrderId(Long btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        public TicketChangingApplyResponseBodyModule setBtripSubOrderId(Long btripSubOrderId) {
            this.btripSubOrderId = btripSubOrderId;
            return this;
        }
        public Long getBtripSubOrderId() {
            return this.btripSubOrderId;
        }

        public TicketChangingApplyResponseBodyModule setCanPay(Boolean canPay) {
            this.canPay = canPay;
            return this;
        }
        public Boolean getCanPay() {
            return this.canPay;
        }

        public TicketChangingApplyResponseBodyModule setChangeFee(Long changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Long getChangeFee() {
            return this.changeFee;
        }

        public TicketChangingApplyResponseBodyModule setDeadlineTime(String deadlineTime) {
            this.deadlineTime = deadlineTime;
            return this;
        }
        public String getDeadlineTime() {
            return this.deadlineTime;
        }

        public TicketChangingApplyResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public TicketChangingApplyResponseBodyModule setDisSubOrderId(String disSubOrderId) {
            this.disSubOrderId = disSubOrderId;
            return this;
        }
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        public TicketChangingApplyResponseBodyModule setMaxRetryTimes(Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public TicketChangingApplyResponseBodyModule setNextRetryInterval(Long nextRetryInterval) {
            this.nextRetryInterval = nextRetryInterval;
            return this;
        }
        public Long getNextRetryInterval() {
            return this.nextRetryInterval;
        }

        public TicketChangingApplyResponseBodyModule setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public TicketChangingApplyResponseBodyModule setRetryClientTips(String retryClientTips) {
            this.retryClientTips = retryClientTips;
            return this;
        }
        public String getRetryClientTips() {
            return this.retryClientTips;
        }

        public TicketChangingApplyResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TicketChangingApplyResponseBodyModule setUpgradeFee(Long upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Long getUpgradeFee() {
            return this.upgradeFee;
        }

    }

}
