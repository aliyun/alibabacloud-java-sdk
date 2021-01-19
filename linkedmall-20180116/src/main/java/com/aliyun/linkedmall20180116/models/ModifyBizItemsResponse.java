// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBizItemsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FailedItemList")
    @Validation(required = true)
    public ModifyBizItemsResponseFailedItemList failedItemList;

    public static ModifyBizItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizItemsResponse self = new ModifyBizItemsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBizItemsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBizItemsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBizItemsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ModifyBizItemsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ModifyBizItemsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModifyBizItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBizItemsResponse setFailedItemList(ModifyBizItemsResponseFailedItemList failedItemList) {
        this.failedItemList = failedItemList;
        return this;
    }
    public ModifyBizItemsResponseFailedItemList getFailedItemList() {
        return this.failedItemList;
    }

    public static class ModifyBizItemsResponseFailedItemListItemSkuIdList extends TeaModel {
        // Sku
        @NameInMap("Sku")
        @Validation(required = true)
        public java.util.List<String> sku;

        public static ModifyBizItemsResponseFailedItemListItemSkuIdList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsResponseFailedItemListItemSkuIdList self = new ModifyBizItemsResponseFailedItemListItemSkuIdList();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsResponseFailedItemListItemSkuIdList setSku(java.util.List<String> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<String> getSku() {
            return this.sku;
        }

    }

    public static class ModifyBizItemsResponseFailedItemListItem extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SkuIdList")
        @Validation(required = true)
        public ModifyBizItemsResponseFailedItemListItemSkuIdList skuIdList;

        public static ModifyBizItemsResponseFailedItemListItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsResponseFailedItemListItem self = new ModifyBizItemsResponseFailedItemListItem();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsResponseFailedItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBizItemsResponseFailedItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBizItemsResponseFailedItemListItem setSkuIdList(ModifyBizItemsResponseFailedItemListItemSkuIdList skuIdList) {
            this.skuIdList = skuIdList;
            return this;
        }
        public ModifyBizItemsResponseFailedItemListItemSkuIdList getSkuIdList() {
            return this.skuIdList;
        }

    }

    public static class ModifyBizItemsResponseFailedItemList extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<ModifyBizItemsResponseFailedItemListItem> item;

        public static ModifyBizItemsResponseFailedItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsResponseFailedItemList self = new ModifyBizItemsResponseFailedItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsResponseFailedItemList setItem(java.util.List<ModifyBizItemsResponseFailedItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ModifyBizItemsResponseFailedItemListItem> getItem() {
            return this.item;
        }

    }

}
