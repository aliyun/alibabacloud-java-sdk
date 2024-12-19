// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Item")
    public QueryItemDetailResponseBodyItem item;

    /**
     * <strong>example:</strong>
     * <p>BizItemGroup [LMALL20210830****] has not the item [65728655****].</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E46C790E-B1F2-51EF-B6F8-B52404B5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        /**
         * <strong>example:</strong>
         * <p>63894836****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>10000102-64426301****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>4990</p>
         */
        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>2499</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>4490</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>4990</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>4490</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>456458315****</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuProperties")
        public String skuProperties;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>5001****</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CenterInventory")
        public Boolean centerInventory;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("DescPath")
        public String descPath;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("IforestProps")
        public String iforestProps;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("IforestPropsJson")
        public String iforestPropsJson;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCanSell")
        public Boolean isCanSell;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSellerPayPostfee")
        public Boolean isSellerPayPostfee;

        /**
         * <strong>example:</strong>
         * <p>64407904****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemImages")
        public QueryItemDetailResponseBodyItemItemImages itemImages;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p>entity</p>
         */
        @NameInMap("LmItemCategory")
        public String lmItemCategory;

        /**
         * <strong>example:</strong>
         * <p>10000043-64818014****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("MinPoints")
        public Long minPoints;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("MinPrice")
        public Long minPrice;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PropertiesJson")
        public String propertiesJson;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        /**
         * <strong>example:</strong>
         * <p>4990</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>424414****</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SellerPayPostfee")
        public Boolean sellerPayPostfee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SellerType")
        public Integer sellerType;

        @NameInMap("Skus")
        public QueryItemDetailResponseBodyItemSkus skus;

        @NameInMap("TbShopName")
        public String tbShopName;

        /**
         * <strong>example:</strong>
         * <p>199</p>
         */
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
