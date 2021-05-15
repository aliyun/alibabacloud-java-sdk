// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ItemList")
    @Validation(required = true)
    public QueryBizItemListResponseItemList itemList;

    public static QueryBizItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListResponse self = new QueryBizItemListResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBizItemListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBizItemListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryBizItemListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBizItemListResponse setItemList(QueryBizItemListResponseItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryBizItemListResponseItemList getItemList() {
        return this.itemList;
    }

    public static class QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList extends TeaModel {
        // UserLabelList
        @NameInMap("UserLabelList")
        @Validation(required = true)
        public java.util.List<String> userLabelList;

        public static QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList self = new QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList setUserLabelList(java.util.List<String> userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel extends TeaModel {
        @NameInMap("CharacteristicCode")
        @Validation(required = true)
        public String characteristicCode;

        @NameInMap("CharacteristicName")
        @Validation(required = true)
        public String characteristicName;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        @NameInMap("CanBuy")
        @Validation(required = true)
        public Boolean canBuy;

        @NameInMap("Exclusive")
        @Validation(required = true)
        public Boolean exclusive;

        @NameInMap("Recommend")
        @Validation(required = true)
        public Boolean recommend;

        @NameInMap("PriceCent")
        @Validation(required = true)
        public Long priceCent;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("PointPrice")
        @Validation(required = true)
        public Long pointPrice;

        @NameInMap("ShowName")
        @Validation(required = true)
        public String showName;

        @NameInMap("AccessUrl")
        @Validation(required = true)
        public String accessUrl;

        @NameInMap("Icon")
        @Validation(required = true)
        public String icon;

        @NameInMap("UserLabelList")
        @Validation(required = true)
        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList userLabelList;

        public static QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel self = new QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setCharacteristicCode(String characteristicCode) {
            this.characteristicCode = characteristicCode;
            return this;
        }
        public String getCharacteristicCode() {
            return this.characteristicCode;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setCharacteristicName(String characteristicName) {
            this.characteristicName = characteristicName;
            return this;
        }
        public String getCharacteristicName() {
            return this.characteristicName;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setCanBuy(Boolean canBuy) {
            this.canBuy = canBuy;
            return this;
        }
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setRecommend(Boolean recommend) {
            this.recommend = recommend;
            return this;
        }
        public Boolean getRecommend() {
            return this.recommend;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel setUserLabelList(QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels extends TeaModel {
        @NameInMap("GradePriceModel")
        @Validation(required = true)
        public java.util.List<QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel> gradePriceModel;

        public static QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels self = new QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels setGradePriceModel(java.util.List<QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel> gradePriceModel) {
            this.gradePriceModel = gradePriceModel;
            return this;
        }
        public java.util.List<QueryBizItemListResponseItemListItemSkuListSkuGradePriceModelsGradePriceModel> getGradePriceModel() {
            return this.gradePriceModel;
        }

    }

    public static class QueryBizItemListResponseItemListItemSkuListSkuUserLabelList extends TeaModel {
        // UserLabelList
        @NameInMap("UserLabelList")
        @Validation(required = true)
        public java.util.List<String> userLabelList;

        public static QueryBizItemListResponseItemListItemSkuListSkuUserLabelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItemSkuListSkuUserLabelList self = new QueryBizItemListResponseItemListItemSkuListSkuUserLabelList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItemSkuListSkuUserLabelList setUserLabelList(java.util.List<String> userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseItemListItemSkuListSku extends TeaModel {
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

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        @Validation(required = true)
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("TaoBaoCurrentPrice")
        @Validation(required = true)
        public Long taoBaoCurrentPrice;

        @NameInMap("GradePriceModels")
        @Validation(required = true)
        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels gradePriceModels;

        @NameInMap("UserLabelList")
        @Validation(required = true)
        public QueryBizItemListResponseItemListItemSkuListSkuUserLabelList userLabelList;

        public static QueryBizItemListResponseItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItemSkuListSku self = new QueryBizItemListResponseItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setTaoBaoCurrentPrice(Long taoBaoCurrentPrice) {
            this.taoBaoCurrentPrice = taoBaoCurrentPrice;
            return this;
        }
        public Long getTaoBaoCurrentPrice() {
            return this.taoBaoCurrentPrice;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setGradePriceModels(QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels gradePriceModels) {
            this.gradePriceModels = gradePriceModels;
            return this;
        }
        public QueryBizItemListResponseItemListItemSkuListSkuGradePriceModels getGradePriceModels() {
            return this.gradePriceModels;
        }

        public QueryBizItemListResponseItemListItemSkuListSku setUserLabelList(QueryBizItemListResponseItemListItemSkuListSkuUserLabelList userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public QueryBizItemListResponseItemListItemSkuListSkuUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListResponseItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        @Validation(required = true)
        public java.util.List<QueryBizItemListResponseItemListItemSkuListSku> sku;

        public static QueryBizItemListResponseItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItemSkuList self = new QueryBizItemListResponseItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItemSkuList setSku(java.util.List<QueryBizItemListResponseItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryBizItemListResponseItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryBizItemListResponseItemListItem extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("CustomizedItemName")
        @Validation(required = true)
        public String customizedItemName;

        @NameInMap("MainPicUrl")
        @Validation(required = true)
        public String mainPicUrl;

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("TaobaoShopName")
        @Validation(required = true)
        public String taobaoShopName;

        @NameInMap("ExtJson")
        @Validation(required = true)
        public String extJson;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("SkuList")
        @Validation(required = true)
        public QueryBizItemListResponseItemListItemSkuList skuList;

        public static QueryBizItemListResponseItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemListItem self = new QueryBizItemListResponseItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemListResponseItemListItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemListResponseItemListItem setCustomizedItemName(String customizedItemName) {
            this.customizedItemName = customizedItemName;
            return this;
        }
        public String getCustomizedItemName() {
            return this.customizedItemName;
        }

        public QueryBizItemListResponseItemListItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryBizItemListResponseItemListItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemListResponseItemListItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryBizItemListResponseItemListItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListResponseItemListItem setTaobaoShopName(String taobaoShopName) {
            this.taobaoShopName = taobaoShopName;
            return this;
        }
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

        public QueryBizItemListResponseItemListItem setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryBizItemListResponseItemListItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryBizItemListResponseItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemListResponseItemListItem setSkuList(QueryBizItemListResponseItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryBizItemListResponseItemListItemSkuList getSkuList() {
            return this.skuList;
        }

    }

    public static class QueryBizItemListResponseItemList extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBizItemListResponseItemListItem> item;

        public static QueryBizItemListResponseItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListResponseItemList self = new QueryBizItemListResponseItemList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListResponseItemList setItem(java.util.List<QueryBizItemListResponseItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBizItemListResponseItemListItem> getItem() {
            return this.item;
        }

    }

}
