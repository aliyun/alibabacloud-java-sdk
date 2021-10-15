// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicAndBizItemsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FailedItemList")
    @Validation(required = true)
    public ModifyBasicAndBizItemsResponseFailedItemList failedItemList;

    public static ModifyBasicAndBizItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicAndBizItemsResponse self = new ModifyBasicAndBizItemsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBasicAndBizItemsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBasicAndBizItemsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBasicAndBizItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBasicAndBizItemsResponse setFailedItemList(ModifyBasicAndBizItemsResponseFailedItemList failedItemList) {
        this.failedItemList = failedItemList;
        return this;
    }
    public ModifyBasicAndBizItemsResponseFailedItemList getFailedItemList() {
        return this.failedItemList;
    }

    public static class ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList extends TeaModel {
        // Sku
        @NameInMap("Sku")
        @Validation(required = true)
        public java.util.List<String> sku;

        public static ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList self = new ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList setSku(java.util.List<String> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<String> getSku() {
            return this.sku;
        }

    }

    public static class ModifyBasicAndBizItemsResponseFailedItemListItem extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SkuIdList")
        @Validation(required = true)
        public ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList skuIdList;

        public static ModifyBasicAndBizItemsResponseFailedItemListItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsResponseFailedItemListItem self = new ModifyBasicAndBizItemsResponseFailedItemListItem();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsResponseFailedItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBasicAndBizItemsResponseFailedItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBasicAndBizItemsResponseFailedItemListItem setSkuIdList(ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList skuIdList) {
            this.skuIdList = skuIdList;
            return this;
        }
        public ModifyBasicAndBizItemsResponseFailedItemListItemSkuIdList getSkuIdList() {
            return this.skuIdList;
        }

    }

    public static class ModifyBasicAndBizItemsResponseFailedItemList extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<ModifyBasicAndBizItemsResponseFailedItemListItem> item;

        public static ModifyBasicAndBizItemsResponseFailedItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsResponseFailedItemList self = new ModifyBasicAndBizItemsResponseFailedItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsResponseFailedItemList setItem(java.util.List<ModifyBasicAndBizItemsResponseFailedItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ModifyBasicAndBizItemsResponseFailedItemListItem> getItem() {
            return this.item;
        }

    }

}
