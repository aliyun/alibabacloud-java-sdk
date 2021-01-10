// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ItemList")
    public QueryItemInventoryResponseBodyItemList itemList;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryItemInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryResponseBody self = new QueryItemInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemInventoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemInventoryResponseBody setItemList(QueryItemInventoryResponseBodyItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryItemInventoryResponseBodyItemList getItemList() {
        return this.itemList;
    }

    public QueryItemInventoryResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemInventoryResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemInventoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemInventoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory extends TeaModel {
        @NameInMap("Quantity")
        public Long quantity;

        public static QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory self = new QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryItemInventoryResponseBodyItemListItemSkuListSku extends TeaModel {
        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("Inventory")
        public QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory inventory;

        public static QueryItemInventoryResponseBodyItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseBodyItemListItemSkuListSku self = new QueryItemInventoryResponseBodyItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseBodyItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemInventoryResponseBodyItemListItemSkuListSku setInventory(QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory inventory) {
            this.inventory = inventory;
            return this;
        }
        public QueryItemInventoryResponseBodyItemListItemSkuListSkuInventory getInventory() {
            return this.inventory;
        }

    }

    public static class QueryItemInventoryResponseBodyItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryItemInventoryResponseBodyItemListItemSkuListSku> sku;

        public static QueryItemInventoryResponseBodyItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseBodyItemListItemSkuList self = new QueryItemInventoryResponseBodyItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseBodyItemListItemSkuList setSku(java.util.List<QueryItemInventoryResponseBodyItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryItemInventoryResponseBodyItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryItemInventoryResponseBodyItemListItem extends TeaModel {
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("SkuList")
        public QueryItemInventoryResponseBodyItemListItemSkuList skuList;

        public static QueryItemInventoryResponseBodyItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseBodyItemListItem self = new QueryItemInventoryResponseBodyItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseBodyItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInventoryResponseBodyItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInventoryResponseBodyItemListItem setSkuList(QueryItemInventoryResponseBodyItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryItemInventoryResponseBodyItemListItemSkuList getSkuList() {
            return this.skuList;
        }

    }

    public static class QueryItemInventoryResponseBodyItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryItemInventoryResponseBodyItemListItem> item;

        public static QueryItemInventoryResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseBodyItemList self = new QueryItemInventoryResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseBodyItemList setItem(java.util.List<QueryItemInventoryResponseBodyItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryItemInventoryResponseBodyItemListItem> getItem() {
            return this.item;
        }

    }

}
