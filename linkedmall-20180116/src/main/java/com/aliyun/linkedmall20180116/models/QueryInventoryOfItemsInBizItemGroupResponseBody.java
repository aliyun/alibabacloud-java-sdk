// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryInventoryOfItemsInBizItemGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseBodyItemList> itemList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryInventoryOfItemsInBizItemGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInventoryOfItemsInBizItemGroupResponseBody self = new QueryInventoryOfItemsInBizItemGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInventoryOfItemsInBizItemGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInventoryOfItemsInBizItemGroupResponseBody setItemList(java.util.List<QueryInventoryOfItemsInBizItemGroupResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public QueryInventoryOfItemsInBizItemGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInventoryOfItemsInBizItemGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList extends TeaModel {
        // 剩余可售库存
        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public Long skuId;

        public static QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList self = new QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList();
            return TeaModel.build(map, self);
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

    public static class QueryInventoryOfItemsInBizItemGroupResponseBodyItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        // 剩余可售库存
        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuList")
        public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList> skuList;

        // 总量库存
        @NameInMap("TotalQuantity")
        public Long totalQuantity;

        // 已售库存
        @NameInMap("TotalSoldQuantity")
        public Long totalSoldQuantity;

        public static QueryInventoryOfItemsInBizItemGroupResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryInventoryOfItemsInBizItemGroupResponseBodyItemList self = new QueryInventoryOfItemsInBizItemGroupResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemList setSkuList(java.util.List<QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseBodyItemListSkuList> getSkuList() {
            return this.skuList;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemList setTotalQuantity(Long totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }
        public Long getTotalQuantity() {
            return this.totalQuantity;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseBodyItemList setTotalSoldQuantity(Long totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Long getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

    }

}
