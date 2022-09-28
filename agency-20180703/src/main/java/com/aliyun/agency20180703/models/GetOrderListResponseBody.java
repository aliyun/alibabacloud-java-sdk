// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetOrderListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOrderListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetOrderListResponseBodyPageInfo pageInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderListResponseBody self = new GetOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrderListResponseBody setData(GetOrderListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrderListResponseBodyData getData() {
        return this.data;
    }

    public GetOrderListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderListResponseBody setPageInfo(GetOrderListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetOrderListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetOrderListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderListResponseBodyDataPopOrderJson extends TeaModel {
        @NameInMap("AnotherPay")
        public Integer anotherPay;

        @NameInMap("ArticleName")
        public String articleName;

        @NameInMap("Fee")
        public String fee;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrderStatus")
        public Long orderStatus;

        @NameInMap("OrderTypeName")
        public String orderTypeName;

        @NameInMap("PayTime")
        public String payTime;

        @NameInMap("Payment")
        public String payment;

        @NameInMap("RamUid")
        public Long ramUid;

        public static GetOrderListResponseBodyDataPopOrderJson build(java.util.Map<String, ?> map) throws Exception {
            GetOrderListResponseBodyDataPopOrderJson self = new GetOrderListResponseBodyDataPopOrderJson();
            return TeaModel.build(map, self);
        }

        public GetOrderListResponseBodyDataPopOrderJson setAnotherPay(Integer anotherPay) {
            this.anotherPay = anotherPay;
            return this;
        }
        public Integer getAnotherPay() {
            return this.anotherPay;
        }

        public GetOrderListResponseBodyDataPopOrderJson setArticleName(String articleName) {
            this.articleName = articleName;
            return this;
        }
        public String getArticleName() {
            return this.articleName;
        }

        public GetOrderListResponseBodyDataPopOrderJson setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public GetOrderListResponseBodyDataPopOrderJson setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetOrderListResponseBodyDataPopOrderJson setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetOrderListResponseBodyDataPopOrderJson setOrderStatus(Long orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Long getOrderStatus() {
            return this.orderStatus;
        }

        public GetOrderListResponseBodyDataPopOrderJson setOrderTypeName(String orderTypeName) {
            this.orderTypeName = orderTypeName;
            return this;
        }
        public String getOrderTypeName() {
            return this.orderTypeName;
        }

        public GetOrderListResponseBodyDataPopOrderJson setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public GetOrderListResponseBodyDataPopOrderJson setPayment(String payment) {
            this.payment = payment;
            return this;
        }
        public String getPayment() {
            return this.payment;
        }

        public GetOrderListResponseBodyDataPopOrderJson setRamUid(Long ramUid) {
            this.ramUid = ramUid;
            return this;
        }
        public Long getRamUid() {
            return this.ramUid;
        }

    }

    public static class GetOrderListResponseBodyData extends TeaModel {
        @NameInMap("PopOrderJson")
        public java.util.List<GetOrderListResponseBodyDataPopOrderJson> popOrderJson;

        public static GetOrderListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderListResponseBodyData self = new GetOrderListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderListResponseBodyData setPopOrderJson(java.util.List<GetOrderListResponseBodyDataPopOrderJson> popOrderJson) {
            this.popOrderJson = popOrderJson;
            return this;
        }
        public java.util.List<GetOrderListResponseBodyDataPopOrderJson> getPopOrderJson() {
            return this.popOrderJson;
        }

    }

    public static class GetOrderListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetOrderListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOrderListResponseBodyPageInfo self = new GetOrderListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetOrderListResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetOrderListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOrderListResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
