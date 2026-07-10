// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class OrderRefundDetailQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public OrderRefundDetailQueryResponseBodyModule module;

    @NameInMap("success")
    public Boolean success;

    public static OrderRefundDetailQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderRefundDetailQueryResponseBody self = new OrderRefundDetailQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderRefundDetailQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderRefundDetailQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OrderRefundDetailQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderRefundDetailQueryResponseBody setModule(OrderRefundDetailQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public OrderRefundDetailQueryResponseBodyModule getModule() {
        return this.module;
    }

    public OrderRefundDetailQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OrderRefundDetailQueryResponseBodyModuleRefundDetails extends TeaModel {
        @NameInMap("person_pay_channel")
        public String personPayChannel;

        @NameInMap("person_refund_id")
        public String personRefundId;

        @NameInMap("refund_amount")
        public Long refundAmount;

        @NameInMap("refund_amount_corp")
        public Long refundAmountCorp;

        @NameInMap("refund_amount_person")
        public Long refundAmountPerson;

        @NameInMap("supplier_refund_id")
        public String supplierRefundId;

        public static OrderRefundDetailQueryResponseBodyModuleRefundDetails build(java.util.Map<String, ?> map) throws Exception {
            OrderRefundDetailQueryResponseBodyModuleRefundDetails self = new OrderRefundDetailQueryResponseBodyModuleRefundDetails();
            return TeaModel.build(map, self);
        }

        public OrderRefundDetailQueryResponseBodyModuleRefundDetails setPersonPayChannel(String personPayChannel) {
            this.personPayChannel = personPayChannel;
            return this;
        }
        public String getPersonPayChannel() {
            return this.personPayChannel;
        }

        public OrderRefundDetailQueryResponseBodyModuleRefundDetails setPersonRefundId(String personRefundId) {
            this.personRefundId = personRefundId;
            return this;
        }
        public String getPersonRefundId() {
            return this.personRefundId;
        }

        public OrderRefundDetailQueryResponseBodyModuleRefundDetails setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public OrderRefundDetailQueryResponseBodyModuleRefundDetails setRefundAmountCorp(Long refundAmountCorp) {
            this.refundAmountCorp = refundAmountCorp;
            return this;
        }
        public Long getRefundAmountCorp() {
            return this.refundAmountCorp;
        }

        public OrderRefundDetailQueryResponseBodyModuleRefundDetails setRefundAmountPerson(Long refundAmountPerson) {
            this.refundAmountPerson = refundAmountPerson;
            return this;
        }
        public Long getRefundAmountPerson() {
            return this.refundAmountPerson;
        }

        public OrderRefundDetailQueryResponseBodyModuleRefundDetails setSupplierRefundId(String supplierRefundId) {
            this.supplierRefundId = supplierRefundId;
            return this;
        }
        public String getSupplierRefundId() {
            return this.supplierRefundId;
        }

    }

    public static class OrderRefundDetailQueryResponseBodyModule extends TeaModel {
        @NameInMap("order_id")
        public String orderId;

        @NameInMap("refund_details")
        public java.util.List<OrderRefundDetailQueryResponseBodyModuleRefundDetails> refundDetails;

        @NameInMap("total_amount")
        public Long totalAmount;

        public static OrderRefundDetailQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            OrderRefundDetailQueryResponseBodyModule self = new OrderRefundDetailQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public OrderRefundDetailQueryResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public OrderRefundDetailQueryResponseBodyModule setRefundDetails(java.util.List<OrderRefundDetailQueryResponseBodyModuleRefundDetails> refundDetails) {
            this.refundDetails = refundDetails;
            return this;
        }
        public java.util.List<OrderRefundDetailQueryResponseBodyModuleRefundDetails> getRefundDetails() {
            return this.refundDetails;
        }

        public OrderRefundDetailQueryResponseBodyModule setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

    }

}
