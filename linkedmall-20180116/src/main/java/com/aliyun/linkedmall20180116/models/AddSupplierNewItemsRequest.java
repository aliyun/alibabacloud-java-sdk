// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddSupplierNewItemsRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ItemList")
    public java.util.List<AddSupplierNewItemsRequestItemList> itemList;

    public static AddSupplierNewItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSupplierNewItemsRequest self = new AddSupplierNewItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddSupplierNewItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddSupplierNewItemsRequest setItemList(java.util.List<AddSupplierNewItemsRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<AddSupplierNewItemsRequestItemList> getItemList() {
        return this.itemList;
    }

    public static class AddSupplierNewItemsRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuList")
        public java.util.List<Long> skuList;

        public static AddSupplierNewItemsRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            AddSupplierNewItemsRequestItemList self = new AddSupplierNewItemsRequestItemList();
            return TeaModel.build(map, self);
        }

        public AddSupplierNewItemsRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public AddSupplierNewItemsRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public AddSupplierNewItemsRequestItemList setSkuList(java.util.List<Long> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<Long> getSkuList() {
            return this.skuList;
        }

    }

}
