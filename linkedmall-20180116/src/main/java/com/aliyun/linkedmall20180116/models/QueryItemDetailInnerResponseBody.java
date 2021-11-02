// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailInnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Item")
    public QueryItemDetailInnerResponseBodyItem item;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryItemDetailInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailInnerResponseBody self = new QueryItemDetailInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailInnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailInnerResponseBody setItem(QueryItemDetailInnerResponseBodyItem item) {
        this.item = item;
        return this;
    }
    public QueryItemDetailInnerResponseBodyItem getItem() {
        return this.item;
    }

    public QueryItemDetailInnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryItemDetailInnerResponseBodyItemSkuPropertysValues extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        public static QueryItemDetailInnerResponseBodyItemSkuPropertysValues build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseBodyItemSkuPropertysValues self = new QueryItemDetailInnerResponseBodyItemSkuPropertysValues();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseBodyItemSkuPropertysValues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailInnerResponseBodyItemSkuPropertysValues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryItemDetailInnerResponseBodyItemSkuPropertys extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Text")
        public String text;

        @NameInMap("Values")
        public java.util.List<QueryItemDetailInnerResponseBodyItemSkuPropertysValues> values;

        public static QueryItemDetailInnerResponseBodyItemSkuPropertys build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseBodyItemSkuPropertys self = new QueryItemDetailInnerResponseBodyItemSkuPropertys();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseBodyItemSkuPropertys setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailInnerResponseBodyItemSkuPropertys setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryItemDetailInnerResponseBodyItemSkuPropertys setValues(java.util.List<QueryItemDetailInnerResponseBodyItemSkuPropertysValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryItemDetailInnerResponseBodyItemSkuPropertysValues> getValues() {
            return this.values;
        }

    }

    public static class QueryItemDetailInnerResponseBodyItemSkus extends TeaModel {
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

        @NameInMap("SkuDesc")
        public String skuDesc;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuPvs")
        public String skuPvs;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("Status")
        public Integer status;

        public static QueryItemDetailInnerResponseBodyItemSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseBodyItemSkus self = new QueryItemDetailInnerResponseBodyItemSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseBodyItemSkus setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setSkuDesc(String skuDesc) {
            this.skuDesc = skuDesc;
            return this;
        }
        public String getSkuDesc() {
            return this.skuDesc;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setSkuPvs(String skuPvs) {
            this.skuPvs = skuPvs;
            return this;
        }
        public String getSkuPvs() {
            return this.skuPvs;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemDetailInnerResponseBodyItemSkus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryItemDetailInnerResponseBodyItem extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryIds")
        public java.util.List<Long> categoryIds;

        @NameInMap("CenterInventory")
        public Boolean centerInventory;

        @NameInMap("City")
        public String city;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("DescPath")
        public String descPath;

        @NameInMap("IforestProps")
        public java.util.List<java.util.Map<String, ?>> iforestProps;

        @NameInMap("IsCanSell")
        public Boolean isCanSell;

        @NameInMap("IsSellerPayPostfee")
        public Boolean isSellerPayPostfee;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemImages")
        public java.util.List<String> itemImages;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemCategory")
        public String lmItemCategory;

        @NameInMap("LmShopId")
        public Long lmShopId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("MinPoints")
        public Long minPoints;

        @NameInMap("MinPrice")
        public Long minPrice;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("Province")
        public String province;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SellerNick")
        public String sellerNick;

        @NameInMap("SellerPayPostfee")
        public Boolean sellerPayPostfee;

        @NameInMap("SkuPropertys")
        public java.util.List<QueryItemDetailInnerResponseBodyItemSkuPropertys> skuPropertys;

        @NameInMap("Skus")
        public java.util.List<QueryItemDetailInnerResponseBodyItemSkus> skus;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("TotalSoldQuantity")
        public Integer totalSoldQuantity;

        public static QueryItemDetailInnerResponseBodyItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseBodyItem self = new QueryItemDetailInnerResponseBodyItem();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseBodyItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailInnerResponseBodyItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailInnerResponseBodyItem setCategoryIds(java.util.List<Long> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }
        public java.util.List<Long> getCategoryIds() {
            return this.categoryIds;
        }

        public QueryItemDetailInnerResponseBodyItem setCenterInventory(Boolean centerInventory) {
            this.centerInventory = centerInventory;
            return this;
        }
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        public QueryItemDetailInnerResponseBodyItem setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryItemDetailInnerResponseBodyItem setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailInnerResponseBodyItem setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailInnerResponseBodyItem setIforestProps(java.util.List<java.util.Map<String, ?>> iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailInnerResponseBodyItem setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public QueryItemDetailInnerResponseBodyItem setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public QueryItemDetailInnerResponseBodyItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailInnerResponseBodyItem setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailInnerResponseBodyItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailInnerResponseBodyItem setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailInnerResponseBodyItem setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public QueryItemDetailInnerResponseBodyItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailInnerResponseBodyItem setMinPoints(Long minPoints) {
            this.minPoints = minPoints;
            return this;
        }
        public Long getMinPoints() {
            return this.minPoints;
        }

        public QueryItemDetailInnerResponseBodyItem setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailInnerResponseBodyItem setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public QueryItemDetailInnerResponseBodyItem setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryItemDetailInnerResponseBodyItem setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailInnerResponseBodyItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailInnerResponseBodyItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemDetailInnerResponseBodyItem setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public QueryItemDetailInnerResponseBodyItem setSellerPayPostfee(Boolean sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailInnerResponseBodyItem setSkuPropertys(java.util.List<QueryItemDetailInnerResponseBodyItemSkuPropertys> skuPropertys) {
            this.skuPropertys = skuPropertys;
            return this;
        }
        public java.util.List<QueryItemDetailInnerResponseBodyItemSkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        public QueryItemDetailInnerResponseBodyItem setSkus(java.util.List<QueryItemDetailInnerResponseBodyItemSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<QueryItemDetailInnerResponseBodyItemSkus> getSkus() {
            return this.skus;
        }

        public QueryItemDetailInnerResponseBodyItem setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemDetailInnerResponseBodyItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

    }

}
