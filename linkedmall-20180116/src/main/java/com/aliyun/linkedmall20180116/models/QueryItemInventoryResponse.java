// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ItemList")
    @Validation(required = true)
    public QueryItemInventoryResponseItemList itemList;

    public static QueryItemInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryResponse self = new QueryItemInventoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemInventoryResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemInventoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemInventoryResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemInventoryResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemInventoryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemInventoryResponse setItemList(QueryItemInventoryResponseItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryItemInventoryResponseItemList getItemList() {
        return this.itemList;
    }

    public static class QueryItemInventoryResponseItemListItemSkuListSkuInventory extends TeaModel {
        @NameInMap("Quantity")
        @Validation(required = true)
        public Long quantity;

        public static QueryItemInventoryResponseItemListItemSkuListSkuInventory build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseItemListItemSkuListSkuInventory self = new QueryItemInventoryResponseItemListItemSkuListSkuInventory();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseItemListItemSkuListSkuInventory setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryItemInventoryResponseItemListItemSkuListSku extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("Inventory")
        @Validation(required = true)
        public QueryItemInventoryResponseItemListItemSkuListSkuInventory inventory;

        public static QueryItemInventoryResponseItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseItemListItemSkuListSku self = new QueryItemInventoryResponseItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemInventoryResponseItemListItemSkuListSku setInventory(QueryItemInventoryResponseItemListItemSkuListSkuInventory inventory) {
            this.inventory = inventory;
            return this;
        }
        public QueryItemInventoryResponseItemListItemSkuListSkuInventory getInventory() {
            return this.inventory;
        }

    }

    public static class QueryItemInventoryResponseItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        @Validation(required = true)
        public java.util.List<QueryItemInventoryResponseItemListItemSkuListSku> sku;

        public static QueryItemInventoryResponseItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseItemListItemSkuList self = new QueryItemInventoryResponseItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseItemListItemSkuList setSku(java.util.List<QueryItemInventoryResponseItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryItemInventoryResponseItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryItemInventoryResponseItemListItem extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SkuList")
        @Validation(required = true)
        public QueryItemInventoryResponseItemListItemSkuList skuList;

        public static QueryItemInventoryResponseItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseItemListItem self = new QueryItemInventoryResponseItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInventoryResponseItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInventoryResponseItemListItem setSkuList(QueryItemInventoryResponseItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryItemInventoryResponseItemListItemSkuList getSkuList() {
            return this.skuList;
        }

    }

    public static class QueryItemInventoryResponseItemList extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryItemInventoryResponseItemListItem> item;

        public static QueryItemInventoryResponseItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryResponseItemList self = new QueryItemInventoryResponseItemList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryResponseItemList setItem(java.util.List<QueryItemInventoryResponseItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryItemInventoryResponseItemListItem> getItem() {
            return this.item;
        }

    }

}
