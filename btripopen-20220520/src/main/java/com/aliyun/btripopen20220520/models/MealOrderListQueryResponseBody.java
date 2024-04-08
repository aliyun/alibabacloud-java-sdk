// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealOrderListQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealOrderListQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static MealOrderListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MealOrderListQueryResponseBody self = new MealOrderListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MealOrderListQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MealOrderListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MealOrderListQueryResponseBody setModule(MealOrderListQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public MealOrderListQueryResponseBodyModule getModule() {
        return this.module;
    }

    public MealOrderListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MealOrderListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MealOrderListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MealOrderListQueryResponseBodyModuleOrderList extends TeaModel {
        @NameInMap("corp_pay_amount")
        public Long corpPayAmount;

        @NameInMap("merchant_name")
        public String merchantName;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("order_type")
        public String orderType;

        @NameInMap("pay_amount")
        public Long payAmount;

        @NameInMap("person_pay_amount")
        public Long personPayAmount;

        @NameInMap("settle_time")
        public String settleTime;

        public static MealOrderListQueryResponseBodyModuleOrderList build(java.util.Map<String, ?> map) throws Exception {
            MealOrderListQueryResponseBodyModuleOrderList self = new MealOrderListQueryResponseBodyModuleOrderList();
            return TeaModel.build(map, self);
        }

        public MealOrderListQueryResponseBodyModuleOrderList setCorpPayAmount(Long corpPayAmount) {
            this.corpPayAmount = corpPayAmount;
            return this;
        }
        public Long getCorpPayAmount() {
            return this.corpPayAmount;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setMerchantName(String merchantName) {
            this.merchantName = merchantName;
            return this;
        }
        public String getMerchantName() {
            return this.merchantName;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setPayAmount(Long payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Long getPayAmount() {
            return this.payAmount;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setPersonPayAmount(Long personPayAmount) {
            this.personPayAmount = personPayAmount;
            return this;
        }
        public Long getPersonPayAmount() {
            return this.personPayAmount;
        }

        public MealOrderListQueryResponseBodyModuleOrderList setSettleTime(String settleTime) {
            this.settleTime = settleTime;
            return this;
        }
        public String getSettleTime() {
            return this.settleTime;
        }

    }

    public static class MealOrderListQueryResponseBodyModule extends TeaModel {
        @NameInMap("order_list")
        public java.util.List<MealOrderListQueryResponseBodyModuleOrderList> orderList;

        public static MealOrderListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MealOrderListQueryResponseBodyModule self = new MealOrderListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MealOrderListQueryResponseBodyModule setOrderList(java.util.List<MealOrderListQueryResponseBodyModuleOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<MealOrderListQueryResponseBodyModuleOrderList> getOrderList() {
            return this.orderList;
        }

    }

}
