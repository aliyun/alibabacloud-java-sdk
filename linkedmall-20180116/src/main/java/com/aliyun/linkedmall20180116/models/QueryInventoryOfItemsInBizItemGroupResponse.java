// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryInventoryOfItemsInBizItemGroupResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ItemList")
    @Validation(required = true)
    public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseItemList> itemList;

    public static QueryInventoryOfItemsInBizItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInventoryOfItemsInBizItemGroupResponse self = new QueryInventoryOfItemsInBizItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setItemList(java.util.List<QueryInventoryOfItemsInBizItemGroupResponseItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseItemList> getItemList() {
        return this.itemList;
    }

    public static class QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        public static QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList self = new QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList();
            return TeaModel.build(map, self);
        }

        public QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryInventoryOfItemsInBizItemGroupResponseItemList extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("SkuList")
        @Validation(required = true)
        public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList> skuList;

        public static QueryInventoryOfItemsInBizItemGroupResponseItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryInventoryOfItemsInBizItemGroupResponseItemList self = new QueryInventoryOfItemsInBizItemGroupResponseItemList();
            return TeaModel.build(map, self);
        }

        public QueryInventoryOfItemsInBizItemGroupResponseItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryInventoryOfItemsInBizItemGroupResponseItemList setSkuList(java.util.List<QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<QueryInventoryOfItemsInBizItemGroupResponseItemListSkuList> getSkuList() {
            return this.skuList;
        }

    }

}
