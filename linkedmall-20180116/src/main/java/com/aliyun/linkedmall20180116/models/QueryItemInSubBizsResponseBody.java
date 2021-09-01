// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInSubBizsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ItemBizList")
    public java.util.List<QueryItemInSubBizsResponseBodyItemBizList> itemBizList;

    public static QueryItemInSubBizsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInSubBizsResponseBody self = new QueryItemInSubBizsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemInSubBizsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemInSubBizsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemInSubBizsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemInSubBizsResponseBody setItemBizList(java.util.List<QueryItemInSubBizsResponseBodyItemBizList> itemBizList) {
        this.itemBizList = itemBizList;
        return this;
    }
    public java.util.List<QueryItemInSubBizsResponseBodyItemBizList> getItemBizList() {
        return this.itemBizList;
    }

    public static class QueryItemInSubBizsResponseBodyItemBizListSkuList extends TeaModel {
        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("PointPrice")
        public Long pointPrice;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("SkuPropertiesJson")
        public String skuPropertiesJson;

        @NameInMap("SkuProperties")
        public String skuProperties;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("BenefitId")
        public String benefitId;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        public static QueryItemInSubBizsResponseBodyItemBizListSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInSubBizsResponseBodyItemBizListSkuList self = new QueryItemInSubBizsResponseBodyItemBizListSkuList();
            return TeaModel.build(map, self);
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setSkuPropertiesJson(String skuPropertiesJson) {
            this.skuPropertiesJson = skuPropertiesJson;
            return this;
        }
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setSkuProperties(String skuProperties) {
            this.skuProperties = skuProperties;
            return this;
        }
        public String getSkuProperties() {
            return this.skuProperties;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public QueryItemInSubBizsResponseBodyItemBizListSkuList setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

    }

    public static class QueryItemInSubBizsResponseBodyItemBizList extends TeaModel {
        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("PropertiesJson")
        public String propertiesJson;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("SubBizId")
        public String subBizId;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("Quantity")
        public Long quantity;

        @NameInMap("SkuList")
        public java.util.List<QueryItemInSubBizsResponseBodyItemBizListSkuList> skuList;

        @NameInMap("ItemImages")
        public java.util.List<String> itemImages;

        public static QueryItemInSubBizsResponseBodyItemBizList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInSubBizsResponseBodyItemBizList self = new QueryItemInSubBizsResponseBodyItemBizList();
            return TeaModel.build(map, self);
        }

        public QueryItemInSubBizsResponseBodyItemBizList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setPropertiesJson(String propertiesJson) {
            this.propertiesJson = propertiesJson;
            return this;
        }
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setSubBizId(String subBizId) {
            this.subBizId = subBizId;
            return this;
        }
        public String getSubBizId() {
            return this.subBizId;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setSkuList(java.util.List<QueryItemInSubBizsResponseBodyItemBizListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<QueryItemInSubBizsResponseBodyItemBizListSkuList> getSkuList() {
            return this.skuList;
        }

        public QueryItemInSubBizsResponseBodyItemBizList setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

    }

}
