// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealOrderDetailQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealOrderDetailQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static MealOrderDetailQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MealOrderDetailQueryResponseBody self = new MealOrderDetailQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MealOrderDetailQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MealOrderDetailQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MealOrderDetailQueryResponseBody setModule(MealOrderDetailQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public MealOrderDetailQueryResponseBodyModule getModule() {
        return this.module;
    }

    public MealOrderDetailQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MealOrderDetailQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MealOrderDetailQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MealOrderDetailQueryResponseBodyModule extends TeaModel {
        @NameInMap("corp_code_order_id")
        public String corpCodeOrderId;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_pay_amount")
        public Long corpPayAmount;

        @NameInMap("corp_refund_amount")
        public Long corpRefundAmount;

        @NameInMap("merchant_name")
        public String merchantName;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("order_sub_status")
        public Integer orderSubStatus;

        @NameInMap("order_type")
        public String orderType;

        @NameInMap("pay_amount")
        public Long payAmount;

        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("person_pay_amount")
        public Long personPayAmount;

        @NameInMap("person_refund_amount")
        public Long personRefundAmount;

        @NameInMap("refund_amount")
        public Long refundAmount;

        @NameInMap("scene_name")
        public String sceneName;

        @NameInMap("settle_time")
        public String settleTime;

        @NameInMap("user_alipay_id")
        public String userAlipayId;

        @NameInMap("user_id")
        public String userId;

        public static MealOrderDetailQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MealOrderDetailQueryResponseBodyModule self = new MealOrderDetailQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MealOrderDetailQueryResponseBodyModule setCorpCodeOrderId(String corpCodeOrderId) {
            this.corpCodeOrderId = corpCodeOrderId;
            return this;
        }
        public String getCorpCodeOrderId() {
            return this.corpCodeOrderId;
        }

        public MealOrderDetailQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public MealOrderDetailQueryResponseBodyModule setCorpPayAmount(Long corpPayAmount) {
            this.corpPayAmount = corpPayAmount;
            return this;
        }
        public Long getCorpPayAmount() {
            return this.corpPayAmount;
        }

        public MealOrderDetailQueryResponseBodyModule setCorpRefundAmount(Long corpRefundAmount) {
            this.corpRefundAmount = corpRefundAmount;
            return this;
        }
        public Long getCorpRefundAmount() {
            return this.corpRefundAmount;
        }

        public MealOrderDetailQueryResponseBodyModule setMerchantName(String merchantName) {
            this.merchantName = merchantName;
            return this;
        }
        public String getMerchantName() {
            return this.merchantName;
        }

        public MealOrderDetailQueryResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public MealOrderDetailQueryResponseBodyModule setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public MealOrderDetailQueryResponseBodyModule setOrderSubStatus(Integer orderSubStatus) {
            this.orderSubStatus = orderSubStatus;
            return this;
        }
        public Integer getOrderSubStatus() {
            return this.orderSubStatus;
        }

        public MealOrderDetailQueryResponseBodyModule setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public MealOrderDetailQueryResponseBodyModule setPayAmount(Long payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Long getPayAmount() {
            return this.payAmount;
        }

        public MealOrderDetailQueryResponseBodyModule setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public MealOrderDetailQueryResponseBodyModule setPersonPayAmount(Long personPayAmount) {
            this.personPayAmount = personPayAmount;
            return this;
        }
        public Long getPersonPayAmount() {
            return this.personPayAmount;
        }

        public MealOrderDetailQueryResponseBodyModule setPersonRefundAmount(Long personRefundAmount) {
            this.personRefundAmount = personRefundAmount;
            return this;
        }
        public Long getPersonRefundAmount() {
            return this.personRefundAmount;
        }

        public MealOrderDetailQueryResponseBodyModule setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public MealOrderDetailQueryResponseBodyModule setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public MealOrderDetailQueryResponseBodyModule setSettleTime(String settleTime) {
            this.settleTime = settleTime;
            return this;
        }
        public String getSettleTime() {
            return this.settleTime;
        }

        public MealOrderDetailQueryResponseBodyModule setUserAlipayId(String userAlipayId) {
            this.userAlipayId = userAlipayId;
            return this;
        }
        public String getUserAlipayId() {
            return this.userAlipayId;
        }

        public MealOrderDetailQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
