// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public QueryItemInventoryV2ResponseBodyItemList itemList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryItemInventoryV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryV2ResponseBody self = new QueryItemInventoryV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemInventoryV2ResponseBody setItemList(QueryItemInventoryV2ResponseBodyItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryItemInventoryV2ResponseBodyItemList getItemList() {
        return this.itemList;
    }

    public QueryItemInventoryV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemInventoryV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemInventoryV2ResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemInventoryV2ResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemInventoryV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory extends TeaModel {
        @NameInMap("Quantity")
        public Long quantity;

        public static QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory self = new QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryItemInventoryV2ResponseBodyItemListItemSkuListSku extends TeaModel {
        @NameInMap("Inventory")
        public QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory inventory;

        @NameInMap("SkuId")
        public Long skuId;

        public static QueryItemInventoryV2ResponseBodyItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryV2ResponseBodyItemListItemSkuListSku self = new QueryItemInventoryV2ResponseBodyItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryV2ResponseBodyItemListItemSkuListSku setInventory(QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory inventory) {
            this.inventory = inventory;
            return this;
        }
        public QueryItemInventoryV2ResponseBodyItemListItemSkuListSkuInventory getInventory() {
            return this.inventory;
        }

        public QueryItemInventoryV2ResponseBodyItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

    public static class QueryItemInventoryV2ResponseBodyItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryItemInventoryV2ResponseBodyItemListItemSkuListSku> sku;

        public static QueryItemInventoryV2ResponseBodyItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryV2ResponseBodyItemListItemSkuList self = new QueryItemInventoryV2ResponseBodyItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryV2ResponseBodyItemListItemSkuList setSku(java.util.List<QueryItemInventoryV2ResponseBodyItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryItemInventoryV2ResponseBodyItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryItemInventoryV2ResponseBodyItemListItem extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuList")
        public QueryItemInventoryV2ResponseBodyItemListItemSkuList skuList;

        public static QueryItemInventoryV2ResponseBodyItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryV2ResponseBodyItemListItem self = new QueryItemInventoryV2ResponseBodyItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryV2ResponseBodyItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInventoryV2ResponseBodyItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInventoryV2ResponseBodyItemListItem setSkuList(QueryItemInventoryV2ResponseBodyItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryItemInventoryV2ResponseBodyItemListItemSkuList getSkuList() {
            return this.skuList;
        }

    }

    public static class QueryItemInventoryV2ResponseBodyItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryItemInventoryV2ResponseBodyItemListItem> item;

        public static QueryItemInventoryV2ResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryV2ResponseBodyItemList self = new QueryItemInventoryV2ResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryV2ResponseBodyItemList setItem(java.util.List<QueryItemInventoryV2ResponseBodyItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryItemInventoryV2ResponseBodyItemListItem> getItem() {
            return this.item;
        }

    }

}
