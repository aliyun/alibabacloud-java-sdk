// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryAmountResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryAmountResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("retryAble")
    public Boolean retryAble;

    @NameInMap("success")
    public Boolean success;

    public static QueryAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAmountResponseBody self = new QueryAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAmountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAmountResponseBody setData(QueryAmountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAmountResponseBodyData getData() {
        return this.data;
    }

    public QueryAmountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAmountResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public QueryAmountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAmountResponseBodyDataItems extends TeaModel {
        @NameInMap("aliyunUid")
        public String aliyunUid;

        @NameInMap("amount")
        public String amount;

        @NameInMap("amountRatio")
        public String amountRatio;

        @NameInMap("listFee")
        public String listFee;

        @NameInMap("price")
        public String price;

        @NameInMap("tier")
        public String tier;

        @NameInMap("totalAmount")
        public String totalAmount;

        public static QueryAmountResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAmountResponseBodyDataItems self = new QueryAmountResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryAmountResponseBodyDataItems setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public QueryAmountResponseBodyDataItems setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryAmountResponseBodyDataItems setAmountRatio(String amountRatio) {
            this.amountRatio = amountRatio;
            return this;
        }
        public String getAmountRatio() {
            return this.amountRatio;
        }

        public QueryAmountResponseBodyDataItems setListFee(String listFee) {
            this.listFee = listFee;
            return this;
        }
        public String getListFee() {
            return this.listFee;
        }

        public QueryAmountResponseBodyDataItems setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryAmountResponseBodyDataItems setTier(String tier) {
            this.tier = tier;
            return this;
        }
        public String getTier() {
            return this.tier;
        }

        public QueryAmountResponseBodyDataItems setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

    }

    public static class QueryAmountResponseBodyDataTotal extends TeaModel {
        @NameInMap("amount")
        public String amount;

        @NameInMap("listFee")
        public String listFee;

        @NameInMap("totalAmount")
        public String totalAmount;

        public static QueryAmountResponseBodyDataTotal build(java.util.Map<String, ?> map) throws Exception {
            QueryAmountResponseBodyDataTotal self = new QueryAmountResponseBodyDataTotal();
            return TeaModel.build(map, self);
        }

        public QueryAmountResponseBodyDataTotal setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryAmountResponseBodyDataTotal setListFee(String listFee) {
            this.listFee = listFee;
            return this;
        }
        public String getListFee() {
            return this.listFee;
        }

        public QueryAmountResponseBodyDataTotal setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

    }

    public static class QueryAmountResponseBodyData extends TeaModel {
        @NameInMap("endDate")
        public String endDate;

        @NameInMap("items")
        public java.util.List<QueryAmountResponseBodyDataItems> items;

        @NameInMap("scopeNote")
        public String scopeNote;

        @NameInMap("startDate")
        public String startDate;

        @NameInMap("total")
        public QueryAmountResponseBodyDataTotal total;

        public static QueryAmountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAmountResponseBodyData self = new QueryAmountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAmountResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryAmountResponseBodyData setItems(java.util.List<QueryAmountResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryAmountResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QueryAmountResponseBodyData setScopeNote(String scopeNote) {
            this.scopeNote = scopeNote;
            return this;
        }
        public String getScopeNote() {
            return this.scopeNote;
        }

        public QueryAmountResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryAmountResponseBodyData setTotal(QueryAmountResponseBodyDataTotal total) {
            this.total = total;
            return this;
        }
        public QueryAmountResponseBodyDataTotal getTotal() {
            return this.total;
        }

    }

}
