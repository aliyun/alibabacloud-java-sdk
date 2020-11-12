// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailInnerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Item")
    @Validation(required = true)
    public QueryItemDetailInnerResponseItem item;

    public static QueryItemDetailInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailInnerResponse self = new QueryItemDetailInnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailInnerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailInnerResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailInnerResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailInnerResponse setItem(QueryItemDetailInnerResponseItem item) {
        this.item = item;
        return this;
    }
    public QueryItemDetailInnerResponseItem getItem() {
        return this.item;
    }

    public static class QueryItemDetailInnerResponseItemSkus extends TeaModel {
        @NameInMap("ExtJson")
        @Validation(required = true)
        public String extJson;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SkuPvs")
        @Validation(required = true)
        public String skuPvs;

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

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SkuDesc")
        @Validation(required = true)
        public String skuDesc;

        public static QueryItemDetailInnerResponseItemSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseItemSkus self = new QueryItemDetailInnerResponseItemSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseItemSkus setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryItemDetailInnerResponseItemSkus setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailInnerResponseItemSkus setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailInnerResponseItemSkus setSkuPvs(String skuPvs) {
            this.skuPvs = skuPvs;
            return this;
        }
        public String getSkuPvs() {
            return this.skuPvs;
        }

        public QueryItemDetailInnerResponseItemSkus setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailInnerResponseItemSkus setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryItemDetailInnerResponseItemSkus setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailInnerResponseItemSkus setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailInnerResponseItemSkus setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryItemDetailInnerResponseItemSkus setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryItemDetailInnerResponseItemSkus setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryItemDetailInnerResponseItemSkus setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailInnerResponseItemSkus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryItemDetailInnerResponseItemSkus setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemDetailInnerResponseItemSkus setSkuDesc(String skuDesc) {
            this.skuDesc = skuDesc;
            return this;
        }
        public String getSkuDesc() {
            return this.skuDesc;
        }

    }

    public static class QueryItemDetailInnerResponseItemSkuPropertysValues extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        public static QueryItemDetailInnerResponseItemSkuPropertysValues build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseItemSkuPropertysValues self = new QueryItemDetailInnerResponseItemSkuPropertysValues();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseItemSkuPropertysValues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailInnerResponseItemSkuPropertysValues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryItemDetailInnerResponseItemSkuPropertys extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<QueryItemDetailInnerResponseItemSkuPropertysValues> values;

        public static QueryItemDetailInnerResponseItemSkuPropertys build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseItemSkuPropertys self = new QueryItemDetailInnerResponseItemSkuPropertys();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseItemSkuPropertys setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryItemDetailInnerResponseItemSkuPropertys setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryItemDetailInnerResponseItemSkuPropertys setValues(java.util.List<QueryItemDetailInnerResponseItemSkuPropertysValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryItemDetailInnerResponseItemSkuPropertysValues> getValues() {
            return this.values;
        }

    }

    public static class QueryItemDetailInnerResponseItem extends TeaModel {
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
        public java.util.Map<String, ?> properties;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("SellerPayPostfee")
        @Validation(required = true)
        public Boolean sellerPayPostfee;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

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

        @NameInMap("Province")
        @Validation(required = true)
        public String province;

        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("DescOption")
        @Validation(required = true)
        public String descOption;

        @NameInMap("SellerNick")
        @Validation(required = true)
        public String sellerNick;

        @NameInMap("LmShopId")
        @Validation(required = true)
        public Long lmShopId;

        @NameInMap("Skus")
        @Validation(required = true)
        public java.util.List<QueryItemDetailInnerResponseItemSkus> skus;

        @NameInMap("SkuPropertys")
        @Validation(required = true)
        public java.util.List<QueryItemDetailInnerResponseItemSkuPropertys> skuPropertys;

        @NameInMap("IforestProps")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> iforestProps;

        @NameInMap("ItemImages")
        @Validation(required = true)
        public java.util.List<String> itemImages;

        @NameInMap("CategoryIds")
        @Validation(required = true)
        public java.util.List<Long> categoryIds;

        public static QueryItemDetailInnerResponseItem build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailInnerResponseItem self = new QueryItemDetailInnerResponseItem();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailInnerResponseItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemDetailInnerResponseItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailInnerResponseItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryItemDetailInnerResponseItem setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public QueryItemDetailInnerResponseItem setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public QueryItemDetailInnerResponseItem setMinPoints(Long minPoints) {
            this.minPoints = minPoints;
            return this;
        }
        public Long getMinPoints() {
            return this.minPoints;
        }

        public QueryItemDetailInnerResponseItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailInnerResponseItem setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemDetailInnerResponseItem setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
            this.isSellerPayPostfee = isSellerPayPostfee;
            return this;
        }
        public Boolean getIsSellerPayPostfee() {
            return this.isSellerPayPostfee;
        }

        public QueryItemDetailInnerResponseItem setIsCanSell(Boolean isCanSell) {
            this.isCanSell = isCanSell;
            return this;
        }
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        public QueryItemDetailInnerResponseItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public QueryItemDetailInnerResponseItem setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public QueryItemDetailInnerResponseItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailInnerResponseItem setSellerPayPostfee(Boolean sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailInnerResponseItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailInnerResponseItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryItemDetailInnerResponseItem setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemDetailInnerResponseItem setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailInnerResponseItem setCenterInventory(Boolean centerInventory) {
            this.centerInventory = centerInventory;
            return this;
        }
        public Boolean getCenterInventory() {
            return this.centerInventory;
        }

        public QueryItemDetailInnerResponseItem setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryItemDetailInnerResponseItem setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryItemDetailInnerResponseItem setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailInnerResponseItem setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public QueryItemDetailInnerResponseItem setLmShopId(Long lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public Long getLmShopId() {
            return this.lmShopId;
        }

        public QueryItemDetailInnerResponseItem setSkus(java.util.List<QueryItemDetailInnerResponseItemSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<QueryItemDetailInnerResponseItemSkus> getSkus() {
            return this.skus;
        }

        public QueryItemDetailInnerResponseItem setSkuPropertys(java.util.List<QueryItemDetailInnerResponseItemSkuPropertys> skuPropertys) {
            this.skuPropertys = skuPropertys;
            return this;
        }
        public java.util.List<QueryItemDetailInnerResponseItemSkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        public QueryItemDetailInnerResponseItem setIforestProps(java.util.List<java.util.Map<String, ?>> iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailInnerResponseItem setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailInnerResponseItem setCategoryIds(java.util.List<Long> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }
        public java.util.List<Long> getCategoryIds() {
            return this.categoryIds;
        }

    }

}
