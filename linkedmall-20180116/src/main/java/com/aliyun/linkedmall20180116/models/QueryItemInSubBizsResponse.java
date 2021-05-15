// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInSubBizsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ItemBizList")
    @Validation(required = true)
    public java.util.List<QueryItemInSubBizsResponseItemBizList> itemBizList;

    public static QueryItemInSubBizsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInSubBizsResponse self = new QueryItemInSubBizsResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemInSubBizsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemInSubBizsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemInSubBizsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemInSubBizsResponse setItemBizList(java.util.List<QueryItemInSubBizsResponseItemBizList> itemBizList) {
        this.itemBizList = itemBizList;
        return this;
    }
    public java.util.List<QueryItemInSubBizsResponseItemBizList> getItemBizList() {
        return this.itemBizList;
    }

    public static class QueryItemInSubBizsResponseItemBizListSkuList extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SkuPicUrl")
        @Validation(required = true)
        public String skuPicUrl;

        @NameInMap("SkuTitle")
        @Validation(required = true)
        public String skuTitle;

        @NameInMap("PriceCent")
        @Validation(required = true)
        public Long priceCent;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        @NameInMap("BenefitId")
        @Validation(required = true)
        public String benefitId;

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("SkuProperties")
        @Validation(required = true)
        public String skuProperties;

        @NameInMap("SkuPropertiesJson")
        @Validation(required = true)
        public String skuPropertiesJson;

        @NameInMap("CustomizedAttributeMap")
        @Validation(required = true)
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("PointPrice")
        @Validation(required = true)
        public Long pointPrice;

        public static QueryItemInSubBizsResponseItemBizListSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInSubBizsResponseItemBizListSkuList self = new QueryItemInSubBizsResponseItemBizListSkuList();
            return TeaModel.build(map, self);
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setSkuProperties(String skuProperties) {
            this.skuProperties = skuProperties;
            return this;
        }
        public String getSkuProperties() {
            return this.skuProperties;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setSkuPropertiesJson(String skuPropertiesJson) {
            this.skuPropertiesJson = skuPropertiesJson;
            return this;
        }
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemInSubBizsResponseItemBizListSkuList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

    }

    public static class QueryItemInSubBizsResponseItemBizList extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SubBizId")
        @Validation(required = true)
        public String subBizId;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Long quantity;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("MainPicUrl")
        @Validation(required = true)
        public String mainPicUrl;

        @NameInMap("DescOption")
        @Validation(required = true)
        public String descOption;

        @NameInMap("PropertiesJson")
        @Validation(required = true)
        public String propertiesJson;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("TbShopName")
        @Validation(required = true)
        public String tbShopName;

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("SkuList")
        @Validation(required = true)
        public java.util.List<QueryItemInSubBizsResponseItemBizListSkuList> skuList;

        @NameInMap("ItemImages")
        @Validation(required = true)
        public java.util.List<String> itemImages;

        public static QueryItemInSubBizsResponseItemBizList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInSubBizsResponseItemBizList self = new QueryItemInSubBizsResponseItemBizList();
            return TeaModel.build(map, self);
        }

        public QueryItemInSubBizsResponseItemBizList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInSubBizsResponseItemBizList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInSubBizsResponseItemBizList setSubBizId(String subBizId) {
            this.subBizId = subBizId;
            return this;
        }
        public String getSubBizId() {
            return this.subBizId;
        }

        public QueryItemInSubBizsResponseItemBizList setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public QueryItemInSubBizsResponseItemBizList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemInSubBizsResponseItemBizList setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemInSubBizsResponseItemBizList setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemInSubBizsResponseItemBizList setPropertiesJson(String propertiesJson) {
            this.propertiesJson = propertiesJson;
            return this;
        }
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        public QueryItemInSubBizsResponseItemBizList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemInSubBizsResponseItemBizList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemInSubBizsResponseItemBizList setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemInSubBizsResponseItemBizList setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemInSubBizsResponseItemBizList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemInSubBizsResponseItemBizList setSkuList(java.util.List<QueryItemInSubBizsResponseItemBizListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<QueryItemInSubBizsResponseItemBizListSkuList> getSkuList() {
            return this.skuList;
        }

        public QueryItemInSubBizsResponseItemBizList setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

    }

}
