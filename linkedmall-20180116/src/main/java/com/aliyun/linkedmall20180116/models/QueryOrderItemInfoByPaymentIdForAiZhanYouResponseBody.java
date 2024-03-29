// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LmOrderList")
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList lmOrderList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody setLmOrderList(QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList lmOrderList) {
        this.lmOrderList = lmOrderList;
        return this;
    }
    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuName")
        public String skuName;

        public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

    public static class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList> lmOrderList;

        public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList self = new QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderList setLmOrderList(java.util.List<QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBodyLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

}
