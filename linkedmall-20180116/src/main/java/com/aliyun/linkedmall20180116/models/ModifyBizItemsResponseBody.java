// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBizItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("FailedItemList")
    public ModifyBizItemsResponseBodyFailedItemList failedItemList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>204F5C60-0B34-5718-AF93-9BD26B37****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ModifyBizItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizItemsResponseBody self = new ModifyBizItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBizItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBizItemsResponseBody setFailedItemList(ModifyBizItemsResponseBodyFailedItemList failedItemList) {
        this.failedItemList = failedItemList;
        return this;
    }
    public ModifyBizItemsResponseBodyFailedItemList getFailedItemList() {
        return this.failedItemList;
    }

    public ModifyBizItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBizItemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ModifyBizItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModifyBizItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBizItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ModifyBizItemsResponseBodyFailedItemListItemSkuIdList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<String> sku;

        public static ModifyBizItemsResponseBodyFailedItemListItemSkuIdList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsResponseBodyFailedItemListItemSkuIdList self = new ModifyBizItemsResponseBodyFailedItemListItemSkuIdList();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsResponseBodyFailedItemListItemSkuIdList setSku(java.util.List<String> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<String> getSku() {
            return this.sku;
        }

    }

    public static class ModifyBizItemsResponseBodyFailedItemListItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>65305223****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>10000102-65305223****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuIdList")
        public ModifyBizItemsResponseBodyFailedItemListItemSkuIdList skuIdList;

        public static ModifyBizItemsResponseBodyFailedItemListItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsResponseBodyFailedItemListItem self = new ModifyBizItemsResponseBodyFailedItemListItem();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsResponseBodyFailedItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBizItemsResponseBodyFailedItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBizItemsResponseBodyFailedItemListItem setSkuIdList(ModifyBizItemsResponseBodyFailedItemListItemSkuIdList skuIdList) {
            this.skuIdList = skuIdList;
            return this;
        }
        public ModifyBizItemsResponseBodyFailedItemListItemSkuIdList getSkuIdList() {
            return this.skuIdList;
        }

    }

    public static class ModifyBizItemsResponseBodyFailedItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ModifyBizItemsResponseBodyFailedItemListItem> item;

        public static ModifyBizItemsResponseBodyFailedItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsResponseBodyFailedItemList self = new ModifyBizItemsResponseBodyFailedItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsResponseBodyFailedItemList setItem(java.util.List<ModifyBizItemsResponseBodyFailedItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ModifyBizItemsResponseBodyFailedItemListItem> getItem() {
            return this.item;
        }

    }

}
