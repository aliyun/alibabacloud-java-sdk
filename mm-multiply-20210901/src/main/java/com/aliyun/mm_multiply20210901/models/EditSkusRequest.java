// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class EditSkusRequest extends TeaModel {
    @NameInMap("DescOption")
    public String descOption;

    @NameInMap("FirstPicUrl")
    public String firstPicUrl;

    @NameInMap("ImageList")
    public java.util.List<EditSkusRequestImageList> imageList;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("Skus")
    public java.util.List<EditSkusRequestSkus> skus;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("Title")
    public String title;

    public static EditSkusRequest build(java.util.Map<String, ?> map) throws Exception {
        EditSkusRequest self = new EditSkusRequest();
        return TeaModel.build(map, self);
    }

    public EditSkusRequest setDescOption(String descOption) {
        this.descOption = descOption;
        return this;
    }
    public String getDescOption() {
        return this.descOption;
    }

    public EditSkusRequest setFirstPicUrl(String firstPicUrl) {
        this.firstPicUrl = firstPicUrl;
        return this;
    }
    public String getFirstPicUrl() {
        return this.firstPicUrl;
    }

    public EditSkusRequest setImageList(java.util.List<EditSkusRequestImageList> imageList) {
        this.imageList = imageList;
        return this;
    }
    public java.util.List<EditSkusRequestImageList> getImageList() {
        return this.imageList;
    }

    public EditSkusRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public EditSkusRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public EditSkusRequest setSkus(java.util.List<EditSkusRequestSkus> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<EditSkusRequestSkus> getSkus() {
        return this.skus;
    }

    public EditSkusRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public EditSkusRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class EditSkusRequestImageList extends TeaModel {
        @NameInMap("SortOrder")
        public String sortOrder;

        @NameInMap("Url")
        public String url;

        public static EditSkusRequestImageList build(java.util.Map<String, ?> map) throws Exception {
            EditSkusRequestImageList self = new EditSkusRequestImageList();
            return TeaModel.build(map, self);
        }

        public EditSkusRequestImageList setSortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public String getSortOrder() {
            return this.sortOrder;
        }

        public EditSkusRequestImageList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class EditSkusRequestSkus extends TeaModel {
        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("Image")
        public String image;

        @NameInMap("MarkPrice")
        public Long markPrice;

        @NameInMap("SellableQuantity")
        public Long sellableQuantity;

        @NameInMap("SkuDesc")
        public String skuDesc;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("SkuPrice")
        public Long skuPrice;

        @NameInMap("SkuTitle")
        public String skuTitle;

        public static EditSkusRequestSkus build(java.util.Map<String, ?> map) throws Exception {
            EditSkusRequestSkus self = new EditSkusRequestSkus();
            return TeaModel.build(map, self);
        }

        public EditSkusRequestSkus setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public EditSkusRequestSkus setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public EditSkusRequestSkus setMarkPrice(Long markPrice) {
            this.markPrice = markPrice;
            return this;
        }
        public Long getMarkPrice() {
            return this.markPrice;
        }

        public EditSkusRequestSkus setSellableQuantity(Long sellableQuantity) {
            this.sellableQuantity = sellableQuantity;
            return this;
        }
        public Long getSellableQuantity() {
            return this.sellableQuantity;
        }

        public EditSkusRequestSkus setSkuDesc(String skuDesc) {
            this.skuDesc = skuDesc;
            return this;
        }
        public String getSkuDesc() {
            return this.skuDesc;
        }

        public EditSkusRequestSkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public EditSkusRequestSkus setSkuPrice(Long skuPrice) {
            this.skuPrice = skuPrice;
            return this;
        }
        public Long getSkuPrice() {
            return this.skuPrice;
        }

        public EditSkusRequestSkus setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

    }

}
