// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetItemDetailResponseBody extends TeaModel {
    @NameInMap("ActivityStatus")
    public String activityStatus;

    // CatagoryLeafId
    @NameInMap("CatagoryLeafId")
    public String catagoryLeafId;

    // Code
    @NameInMap("Code")
    public String code;

    @NameInMap("DescOption")
    public String descOption;

    // DescPath
    @NameInMap("DescPath")
    public String descPath;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // errorMessage
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FirstPicUrl")
    public String firstPicUrl;

    // Images
    @NameInMap("Images")
    public java.util.List<GetItemDetailResponseBodyImages> images;

    // ItemId
    @NameInMap("ItemId")
    public String itemId;

    // ItemParamsInfo
    @NameInMap("ItemParamsInfo")
    public String itemParamsInfo;

    // Message
    @NameInMap("Message")
    public String message;

    // PicUrl
    @NameInMap("PicUrl")
    public String picUrl;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Skus
    @NameInMap("Skus")
    public java.util.List<GetItemDetailResponseBodySkus> skus;

    // SourceChannel
    @NameInMap("SourceChannel")
    public Integer sourceChannel;

    @NameInMap("SourceChannelName")
    public String sourceChannelName;

    // Status
    @NameInMap("Status")
    public Integer status;

    // StoreId
    @NameInMap("StoreId")
    public String storeId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    // TbItemId
    @NameInMap("TbItemId")
    public String tbItemId;

    // Title
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
        // IsMain
        @NameInMap("IsMain")
        public Integer isMain;

        // SortOrder
        @NameInMap("SortOrder")
        public Integer sortOrder;

        // Type
        @NameInMap("Type")
        public Integer type;

        // Url
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
        // CurrencyCode
        @NameInMap("CurrencyCode")
        public String currencyCode;

        // Image
        @NameInMap("Image")
        public String image;

        // ItemId
        @NameInMap("ItemId")
        public String itemId;

        // MarkPrice
        @NameInMap("MarkPrice")
        public Long markPrice;

        // SellableQuantity
        @NameInMap("SellableQuantity")
        public Long sellableQuantity;

        // SkuDesc
        @NameInMap("SkuDesc")
        public String skuDesc;

        // SkuId
        @NameInMap("SkuId")
        public String skuId;

        // SkuPrice
        @NameInMap("SkuPrice")
        public Long skuPrice;

        // SkuTitle
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
