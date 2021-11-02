// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Item")
    public QueryItemDetailResponseBodyItem item;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailResponseBody self = new QueryItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailResponseBody setItem(QueryItemDetailResponseBodyItem item) {
        this.item = item;
        return this;
    }
    public QueryItemDetailResponseBodyItem getItem() {
        return this.item;
    }

    public QueryItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemDetailResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryItemDetailResponseBodyItemItemImages extends TeaModel {
        @NameInMap("ItemImage")
        public java.util.List<String> itemImage;

        public static QueryItemDetailResponseBodyItemItemImages build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyItemItemImages self = new QueryItemDetailResponseBodyItemItemImages();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyItemItemImages setItemImage(java.util.List<String> itemImage) {
            this.itemImage = itemImage;
            return this;
        }
        public java.util.List<String> getItemImage() {
            return this.itemImage;
        }

    }

    public static class QueryItemDetailResponseBodyItemSkusSku extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PointPrice")
        public Long pointPrice;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuProperties")
        public String skuProperties;

        @NameInMap("SkuPropertiesJson")
        public String skuPropertiesJson;

        @NameInMap("SkuTitle")
        public String skuTitle;

        public static QueryItemDetailResponseBodyItemSkusSku build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyItemSkusSku self = new QueryItemDetailResponseBodyItemSkusSku();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyItemSkusSku setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailResponseBodyItemSkusSku setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailResponseBodyItemSkusSku setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailResponseBodyItemSkusSku setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseBodyItemSkusSku setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailResponseBodyItemSkusSku setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryItemDetailResponseBodyItemSkusSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemDetailResponseBodyItemSkusSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemDetailResponseBodyItemSkusSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailResponseBodyItemSkusSku setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailResponseBodyItemSkusSku setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailResponseBodyItemSkusSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailResponseBodyItemSkusSku setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailResponseBodyItemSkusSku setSkuProperties(String skuProperties) {
            this.skuProperties = skuProperties;
            return this;
        }
        public String getSkuProperties() {
            return this.skuProperties;
        }

        public QueryItemDetailResponseBodyItemSkusSku setSkuPropertiesJson(String skuPropertiesJson) {
            this.skuPropertiesJson = skuPropertiesJson;
            return this;
        }
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        public QueryItemDetailResponseBodyItemSkusSku setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

    }

    public static class QueryItemDetailResponseBodyItemSkus extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryItemDetailResponseBodyItemSkusSku> sku;

        public static QueryItemDetailResponseBodyItemSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyItemSkus self = new QueryItemDetailResponseBodyItemSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyItemSkus setSku(java.util.List<QueryItemDetailResponseBodyItemSkusSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryItemDetailResponseBodyItemSkusSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryItemDetailResponseBodyItem extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CenterInventory")
        public Boolean centerInventory;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("DescPath")
        public String descPath;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("IforestProps")
        public String iforestProps;

        @NameInMap("IforestPropsJson")
        public String iforestPropsJson;

        @NameInMap("IsCanSell")
        public Boolean isCanSell;

        @NameInMap("IsSellerPayPostfee")
        public Boolean isSellerPayPostfee;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemImages")
        public QueryItemDetailResponseBodyItemItemImages itemImages;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemCategory")
        public String lmItemCategory;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("MinPoints")
        public Long minPoints;

        @NameInMap("MinPrice")
        public Long minPrice;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("PropertiesJson")
        public String propertiesJson;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SellerPayPostfee")
        public Boolean sellerPayPostfee;

        @NameInMap("SellerType")
        public Integer sellerType;

        @NameInMap("Skus")
        public QueryItemDetailResponseBodyItemSkus skus;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("TotalSoldQuantity")
        public Integer totalSoldQuantity;

        @NameInMap("VideoPicUrl")
        public String videoPicUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static QueryItemDetailResponseBodyItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyItem self = new QueryItemDetailResponseBodyItem();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailResponseBodyItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailResponseBodyItem setCenterInventory(Boolean centerInventory) {
            this.centerInventory = centerInventory;
            return this;
        }
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        public QueryItemDetailResponseBodyItem setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemDetailResponseBodyItem setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailResponseBodyItem setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailResponseBodyItem setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailResponseBodyItem setIforestProps(String iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public String getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailResponseBodyItem setIforestPropsJson(String iforestPropsJson) {
            this.iforestPropsJson = iforestPropsJson;
            return this;
        }
        public String getIforestPropsJson() {
            return this.iforestPropsJson;
        }

        public QueryItemDetailResponseBodyItem setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public QueryItemDetailResponseBodyItem setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public QueryItemDetailResponseBodyItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseBodyItem setItemImages(QueryItemDetailResponseBodyItemItemImages itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public QueryItemDetailResponseBodyItemItemImages getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailResponseBodyItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailResponseBodyItem setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailResponseBodyItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailResponseBodyItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailResponseBodyItem setMinPoints(Long minPoints) {
            this.minPoints = minPoints;
            return this;
        }
        public Long getMinPoints() {
            return this.minPoints;
        }

        public QueryItemDetailResponseBodyItem setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailResponseBodyItem setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryItemDetailResponseBodyItem setPropertiesJson(String propertiesJson) {
            this.propertiesJson = propertiesJson;
            return this;
        }
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        public QueryItemDetailResponseBodyItem setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailResponseBodyItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailResponseBodyItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemDetailResponseBodyItem setSellerPayPostfee(Boolean sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailResponseBodyItem setSellerType(Integer sellerType) {
            this.sellerType = sellerType;
            return this;
        }
        public Integer getSellerType() {
            return this.sellerType;
        }

        public QueryItemDetailResponseBodyItem setSkus(QueryItemDetailResponseBodyItemSkus skus) {
            this.skus = skus;
            return this;
        }
        public QueryItemDetailResponseBodyItemSkus getSkus() {
            return this.skus;
        }

        public QueryItemDetailResponseBodyItem setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemDetailResponseBodyItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public QueryItemDetailResponseBodyItem setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public QueryItemDetailResponseBodyItem setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
