// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetOrderDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOrderDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailResponseBody self = new GetOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrderDetailResponseBody setData(GetOrderDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrderDetailResponseBodyData getData() {
        return this.data;
    }

    public GetOrderDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderDetailResponseBodyData extends TeaModel {
        @NameInMap("ChargeType")
        public Long chargeType;

        @NameInMap("Cycle")
        public String cycle;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrderStatus")
        public Long orderStatus;

        @NameInMap("OrderTypeName")
        public String orderTypeName;

        @NameInMap("PayAmount")
        public String payAmount;

        @NameInMap("PayTime")
        public String payTime;

        @NameInMap("ResourceFee")
        public String resourceFee;

        @NameInMap("TotalPayFee")
        public String totalPayFee;

        public static GetOrderDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyData self = new GetOrderDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyData setChargeType(Long chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public Long getChargeType() {
            return this.chargeType;
        }

        public GetOrderDetailResponseBodyData setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public GetOrderDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetOrderDetailResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetOrderDetailResponseBodyData setOrderStatus(Long orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Long getOrderStatus() {
            return this.orderStatus;
        }

        public GetOrderDetailResponseBodyData setOrderTypeName(String orderTypeName) {
            this.orderTypeName = orderTypeName;
            return this;
        }
        public String getOrderTypeName() {
            return this.orderTypeName;
        }

        public GetOrderDetailResponseBodyData setPayAmount(String payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public String getPayAmount() {
            return this.payAmount;
        }

        public GetOrderDetailResponseBodyData setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public GetOrderDetailResponseBodyData setResourceFee(String resourceFee) {
            this.resourceFee = resourceFee;
            return this;
        }
        public String getResourceFee() {
            return this.resourceFee;
        }

        public GetOrderDetailResponseBodyData setTotalPayFee(String totalPayFee) {
            this.totalPayFee = totalPayFee;
            return this;
        }
        public String getTotalPayFee() {
            return this.totalPayFee;
        }

    }

}
