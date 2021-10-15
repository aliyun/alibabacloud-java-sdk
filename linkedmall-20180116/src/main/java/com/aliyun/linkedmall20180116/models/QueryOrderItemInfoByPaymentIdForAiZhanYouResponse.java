// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderItemInfoByPaymentIdForAiZhanYouResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LmOrderList")
    @Validation(required = true)
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList lmOrderList;

    public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderItemInfoByPaymentIdForAiZhanYouResponse self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse setLmOrderList(QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList lmOrderList) {
        this.lmOrderList = lmOrderList;
        return this;
    }
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    public static class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList extends TeaModel {
        @NameInMap("ItemName")
        @Validation(required = true)
        public String itemName;

        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SkuName")
        @Validation(required = true)
        public String skuName;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

    }

    public static class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList> lmOrderList;

        public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderList setLmOrderList(java.util.List<QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<QueryOrderItemInfoByPaymentIdForAiZhanYouResponseLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

}
