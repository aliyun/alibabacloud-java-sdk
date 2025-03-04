// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicAndBizItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("FailedItemList")
    public ModifyBasicAndBizItemsResponseBodyFailedItemList failedItemList;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F957A835-87CE-5E5F-B0A9-A66B081E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBasicAndBizItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicAndBizItemsResponseBody self = new ModifyBasicAndBizItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBasicAndBizItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBasicAndBizItemsResponseBody setFailedItemList(ModifyBasicAndBizItemsResponseBodyFailedItemList failedItemList) {
        this.failedItemList = failedItemList;
        return this;
    }
    public ModifyBasicAndBizItemsResponseBodyFailedItemList getFailedItemList() {
        return this.failedItemList;
    }

    public ModifyBasicAndBizItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBasicAndBizItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<String> sku;

        public static ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList self = new ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList setSku(java.util.List<String> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<String> getSku() {
            return this.sku;
        }

    }

    public static class ModifyBasicAndBizItemsResponseBodyFailedItemListItem extends TeaModel {
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
        public ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList skuIdList;

        public static ModifyBasicAndBizItemsResponseBodyFailedItemListItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsResponseBodyFailedItemListItem self = new ModifyBasicAndBizItemsResponseBodyFailedItemListItem();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsResponseBodyFailedItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBasicAndBizItemsResponseBodyFailedItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBasicAndBizItemsResponseBodyFailedItemListItem setSkuIdList(ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList skuIdList) {
            this.skuIdList = skuIdList;
            return this;
        }
        public ModifyBasicAndBizItemsResponseBodyFailedItemListItemSkuIdList getSkuIdList() {
            return this.skuIdList;
        }

    }

    public static class ModifyBasicAndBizItemsResponseBodyFailedItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ModifyBasicAndBizItemsResponseBodyFailedItemListItem> item;

        public static ModifyBasicAndBizItemsResponseBodyFailedItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsResponseBodyFailedItemList self = new ModifyBasicAndBizItemsResponseBodyFailedItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsResponseBodyFailedItemList setItem(java.util.List<ModifyBasicAndBizItemsResponseBodyFailedItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ModifyBasicAndBizItemsResponseBodyFailedItemListItem> getItem() {
            return this.item;
        }

    }

}
