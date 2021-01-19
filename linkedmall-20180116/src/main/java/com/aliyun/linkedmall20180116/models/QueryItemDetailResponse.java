// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Item")
    @Validation(required = true)
    public QueryItemDetailResponseItem item;

    public static QueryItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailResponse self = new QueryItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemDetailResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemDetailResponse setItem(QueryItemDetailResponseItem item) {
        this.item = item;
        return this;
    }
    public QueryItemDetailResponseItem getItem() {
        return this.item;
    }

    public static class QueryItemDetailResponseItemSkusSku extends TeaModel {
        @NameInMap("ExtJson")
        @Validation(required = true)
        public String extJson;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SkuProperties")
        @Validation(required = true)
        public String skuProperties;

        @NameInMap("SkuPicUrl")
        @Validation(required = true)
        public String skuPicUrl;

        @NameInMap("SkuTitle")
        @Validation(required = true)
        public String skuTitle;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("PriceCent")
        @Validation(required = true)
        public Long priceCent;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        @NameInMap("PointPrice")
        @Validation(required = true)
        public Long pointPrice;

        @NameInMap("SkuPropertiesJson")
        @Validation(required = true)
        public String skuPropertiesJson;

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        @Validation(required = true)
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        public static QueryItemDetailResponseItemSkusSku build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseItemSkusSku self = new QueryItemDetailResponseItemSkusSku();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseItemSkusSku setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailResponseItemSkusSku setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseItemSkusSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailResponseItemSkusSku setSkuProperties(String skuProperties) {
            this.skuProperties = skuProperties;
            return this;
        }
        public String getSkuProperties() {
            return this.skuProperties;
        }

        public QueryItemDetailResponseItemSkusSku setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailResponseItemSkusSku setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemDetailResponseItemSkusSku setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailResponseItemSkusSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailResponseItemSkusSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemDetailResponseItemSkusSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemDetailResponseItemSkusSku setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryItemDetailResponseItemSkusSku setSkuPropertiesJson(String skuPropertiesJson) {
            this.skuPropertiesJson = skuPropertiesJson;
            return this;
        }
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        public QueryItemDetailResponseItemSkusSku setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailResponseItemSkusSku setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailResponseItemSkusSku setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailResponseItemSkusSku setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

    }

    public static class QueryItemDetailResponseItemSkus extends TeaModel {
        @NameInMap("Sku")
        @Validation(required = true)
        public java.util.List<QueryItemDetailResponseItemSkusSku> sku;

        public static QueryItemDetailResponseItemSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseItemSkus self = new QueryItemDetailResponseItemSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseItemSkus setSku(java.util.List<QueryItemDetailResponseItemSkusSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryItemDetailResponseItemSkusSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryItemDetailResponseItemItemImages extends TeaModel {
        // ItemImage
        @NameInMap("ItemImage")
        @Validation(required = true)
        public java.util.List<String> itemImage;

        public static QueryItemDetailResponseItemItemImages build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseItemItemImages self = new QueryItemDetailResponseItemItemImages();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseItemItemImages setItemImage(java.util.List<String> itemImage) {
            this.itemImage = itemImage;
            return this;
        }
        public java.util.List<String> getItemImage() {
            return this.itemImage;
        }

    }

    public static class QueryItemDetailResponseItem extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("MainPicUrl")
        @Validation(required = true)
        public String mainPicUrl;

        @NameInMap("DescPath")
        @Validation(required = true)
        public String descPath;

        @NameInMap("MinPrice")
        @Validation(required = true)
        public Long minPrice;

        @NameInMap("MinPoints")
        @Validation(required = true)
        public Long minPoints;

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("IsSellerPayPostfee")
        @Validation(required = true)
        public Boolean isSellerPayPostfee;

        @NameInMap("IsCanSell")
        @Validation(required = true)
        public Boolean isCanSell;

        @NameInMap("TotalSoldQuantity")
        @Validation(required = true)
        public Integer totalSoldQuantity;

        @NameInMap("Properties")
        @Validation(required = true)
        public String properties;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("SellerPayPostfee")
        @Validation(required = true)
        public Boolean sellerPayPostfee;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("ExtJson")
        @Validation(required = true)
        public String extJson;

        @NameInMap("PropertiesJson")
        @Validation(required = true)
        public String propertiesJson;

        @NameInMap("IforestPropsJson")
        @Validation(required = true)
        public String iforestPropsJson;

        @NameInMap("DescOption")
        @Validation(required = true)
        public String descOption;

        @NameInMap("IforestProps")
        @Validation(required = true)
        public String iforestProps;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("TbShopName")
        @Validation(required = true)
        public String tbShopName;

        @NameInMap("LmItemCategory")
        @Validation(required = true)
        public String lmItemCategory;

        @NameInMap("CenterInventory")
        @Validation(required = true)
        public Boolean centerInventory;

        @NameInMap("CustomizedAttributeMap")
        @Validation(required = true)
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SellerType")
        @Validation(required = true)
        public Integer sellerType;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        @NameInMap("VideoPicUrl")
        @Validation(required = true)
        public String videoPicUrl;

        @NameInMap("Skus")
        @Validation(required = true)
        public QueryItemDetailResponseItemSkus skus;

        @NameInMap("ItemImages")
        @Validation(required = true)
        public QueryItemDetailResponseItemItemImages itemImages;

        public static QueryItemDetailResponseItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseItem self = new QueryItemDetailResponseItem();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailResponseItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailResponseItem setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailResponseItem setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailResponseItem setMinPoints(Long minPoints) {
            this.minPoints = minPoints;
            return this;
        }
        public Long getMinPoints() {
            return this.minPoints;
        }

        public QueryItemDetailResponseItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailResponseItem setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailResponseItem setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public QueryItemDetailResponseItem setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public QueryItemDetailResponseItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public QueryItemDetailResponseItem setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryItemDetailResponseItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailResponseItem setSellerPayPostfee(Boolean sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailResponseItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailResponseItem setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailResponseItem setPropertiesJson(String propertiesJson) {
            this.propertiesJson = propertiesJson;
            return this;
        }
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        public QueryItemDetailResponseItem setIforestPropsJson(String iforestPropsJson) {
            this.iforestPropsJson = iforestPropsJson;
            return this;
        }
        public String getIforestPropsJson() {
            return this.iforestPropsJson;
        }

        public QueryItemDetailResponseItem setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailResponseItem setIforestProps(String iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public String getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailResponseItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemDetailResponseItem setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemDetailResponseItem setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailResponseItem setCenterInventory(Boolean centerInventory) {
            this.centerInventory = centerInventory;
            return this;
        }
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        public QueryItemDetailResponseItem setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailResponseItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailResponseItem setSellerType(Integer sellerType) {
            this.sellerType = sellerType;
            return this;
        }
        public Integer getSellerType() {
            return this.sellerType;
        }

        public QueryItemDetailResponseItem setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public QueryItemDetailResponseItem setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public QueryItemDetailResponseItem setSkus(QueryItemDetailResponseItemSkus skus) {
            this.skus = skus;
            return this;
        }
        public QueryItemDetailResponseItemSkus getSkus() {
            return this.skus;
        }

        public QueryItemDetailResponseItem setItemImages(QueryItemDetailResponseItemItemImages itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public QueryItemDetailResponseItemItemImages getItemImages() {
            return this.itemImages;
        }

    }

}
