// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetItemDetailResponseBody extends TeaModel {
    @NameInMap("ActivityStatus")
    public String activityStatus;

    @NameInMap("CatagoryLeafId")
    public String catagoryLeafId;

    @NameInMap("Code")
    public String code;

    @NameInMap("DescOption")
    public String descOption;

    @NameInMap("DescPath")
    public String descPath;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FirstPicUrl")
    public String firstPicUrl;

    @NameInMap("Images")
    public java.util.List<GetItemDetailResponseBodyImages> images;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("ItemParamsInfo")
    public String itemParamsInfo;

    @NameInMap("Message")
    public String message;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Skus")
    public java.util.List<GetItemDetailResponseBodySkus> skus;

    @NameInMap("SourceChannel")
    public Integer sourceChannel;

    @NameInMap("SourceChannelName")
    public String sourceChannelName;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TbItemId")
    public String tbItemId;

    @NameInMap("Title")
    public String title;

    public static GetItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetItemDetailResponseBody self = new GetItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetItemDetailResponseBody setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }
    public String getActivityStatus() {
        return this.activityStatus;
    }

    public GetItemDetailResponseBody setCatagoryLeafId(String catagoryLeafId) {
        this.catagoryLeafId = catagoryLeafId;
        return this;
    }
    public String getCatagoryLeafId() {
        return this.catagoryLeafId;
    }

    public GetItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetItemDetailResponseBody setDescOption(String descOption) {
        this.descOption = descOption;
        return this;
    }
    public String getDescOption() {
        return this.descOption;
    }

    public GetItemDetailResponseBody setDescPath(String descPath) {
        this.descPath = descPath;
        return this;
    }
    public String getDescPath() {
        return this.descPath;
    }

    public GetItemDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetItemDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetItemDetailResponseBody setFirstPicUrl(String firstPicUrl) {
        this.firstPicUrl = firstPicUrl;
        return this;
    }
    public String getFirstPicUrl() {
        return this.firstPicUrl;
    }

    public GetItemDetailResponseBody setImages(java.util.List<GetItemDetailResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<GetItemDetailResponseBodyImages> getImages() {
        return this.images;
    }

    public GetItemDetailResponseBody setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public GetItemDetailResponseBody setItemParamsInfo(String itemParamsInfo) {
        this.itemParamsInfo = itemParamsInfo;
        return this;
    }
    public String getItemParamsInfo() {
        return this.itemParamsInfo;
    }

    public GetItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetItemDetailResponseBody setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public GetItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetItemDetailResponseBody setSkus(java.util.List<GetItemDetailResponseBodySkus> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<GetItemDetailResponseBodySkus> getSkus() {
        return this.skus;
    }

    public GetItemDetailResponseBody setSourceChannel(Integer sourceChannel) {
        this.sourceChannel = sourceChannel;
        return this;
    }
    public Integer getSourceChannel() {
        return this.sourceChannel;
    }

    public GetItemDetailResponseBody setSourceChannelName(String sourceChannelName) {
        this.sourceChannelName = sourceChannelName;
        return this;
    }
    public String getSourceChannelName() {
        return this.sourceChannelName;
    }

    public GetItemDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetItemDetailResponseBody setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public GetItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetItemDetailResponseBody setTbItemId(String tbItemId) {
        this.tbItemId = tbItemId;
        return this;
    }
    public String getTbItemId() {
        return this.tbItemId;
    }

    public GetItemDetailResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class GetItemDetailResponseBodyImages extends TeaModel {
        @NameInMap("IsMain")
        public Integer isMain;

        @NameInMap("SortOrder")
        public Integer sortOrder;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Url")
        public String url;

        public static GetItemDetailResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            GetItemDetailResponseBodyImages self = new GetItemDetailResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public GetItemDetailResponseBodyImages setIsMain(Integer isMain) {
            this.isMain = isMain;
            return this;
        }
        public Integer getIsMain() {
            return this.isMain;
        }

        public GetItemDetailResponseBodyImages setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        public GetItemDetailResponseBodyImages setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetItemDetailResponseBodyImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetItemDetailResponseBodySkus extends TeaModel {
        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("Image")
        public String image;

        @NameInMap("ItemId")
        public String itemId;

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

        public static GetItemDetailResponseBodySkus build(java.util.Map<String, ?> map) throws Exception {
            GetItemDetailResponseBodySkus self = new GetItemDetailResponseBodySkus();
            return TeaModel.build(map, self);
        }

        public GetItemDetailResponseBodySkus setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public GetItemDetailResponseBodySkus setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetItemDetailResponseBodySkus setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetItemDetailResponseBodySkus setMarkPrice(Long markPrice) {
            this.markPrice = markPrice;
            return this;
        }
        public Long getMarkPrice() {
            return this.markPrice;
        }

        public GetItemDetailResponseBodySkus setSellableQuantity(Long sellableQuantity) {
            this.sellableQuantity = sellableQuantity;
            return this;
        }
        public Long getSellableQuantity() {
            return this.sellableQuantity;
        }

        public GetItemDetailResponseBodySkus setSkuDesc(String skuDesc) {
            this.skuDesc = skuDesc;
            return this;
        }
        public String getSkuDesc() {
            return this.skuDesc;
        }

        public GetItemDetailResponseBodySkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public GetItemDetailResponseBodySkus setSkuPrice(Long skuPrice) {
            this.skuPrice = skuPrice;
            return this;
        }
        public Long getSkuPrice() {
            return this.skuPrice;
        }

        public GetItemDetailResponseBodySkus setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

    }

}
