// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public QueryBizItemListV2ResponseBodyItemList itemList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryBizItemListV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListV2ResponseBody self = new QueryBizItemListV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBizItemListV2ResponseBody setItemList(QueryBizItemListV2ResponseBodyItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryBizItemListV2ResponseBodyItemList getItemList() {
        return this.itemList;
    }

    public QueryBizItemListV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBizItemListV2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBizItemListV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList extends TeaModel {
        @NameInMap("UserLabelList")
        public java.util.List<String> userLabelList;

        public static QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList self = new QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList setUserLabelList(java.util.List<String> userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel extends TeaModel {
        @NameInMap("AccessUrl")
        public String accessUrl;

        @NameInMap("CanBuy")
        public Boolean canBuy;

        @NameInMap("CharacteristicCode")
        public String characteristicCode;

        @NameInMap("CharacteristicName")
        public String characteristicName;

        @NameInMap("Exclusive")
        public Boolean exclusive;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("PointPrice")
        public Long pointPrice;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Recommend")
        public Boolean recommend;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("UserLabelList")
        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList userLabelList;

        public static QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel self = new QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setCanBuy(Boolean canBuy) {
            this.canBuy = canBuy;
            return this;
        }
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setCharacteristicCode(String characteristicCode) {
            this.characteristicCode = characteristicCode;
            return this;
        }
        public String getCharacteristicCode() {
            return this.characteristicCode;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setCharacteristicName(String characteristicName) {
            this.characteristicName = characteristicName;
            return this;
        }
        public String getCharacteristicName() {
            return this.characteristicName;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }
        public Boolean getExclusive() {
            return this.exclusive;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setRecommend(Boolean recommend) {
            this.recommend = recommend;
            return this;
        }
        public Boolean getRecommend() {
            return this.recommend;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel setUserLabelList(QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModelUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels extends TeaModel {
        @NameInMap("GradePriceModel")
        public java.util.List<QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel> gradePriceModel;

        public static QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels self = new QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels setGradePriceModel(java.util.List<QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel> gradePriceModel) {
            this.gradePriceModel = gradePriceModel;
            return this;
        }
        public java.util.List<QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModelsGradePriceModel> getGradePriceModel() {
            return this.gradePriceModel;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList extends TeaModel {
        @NameInMap("UserLabelList")
        public java.util.List<String> userLabelList;

        public static QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList self = new QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList setUserLabelList(java.util.List<String> userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public java.util.List<String> getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemListItemSkuListSku extends TeaModel {
        @NameInMap("BenefitId")
        public String benefitId;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("GradePriceModels")
        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels gradePriceModels;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("TaoBaoCurrentPrice")
        public Long taoBaoCurrentPrice;

        @NameInMap("UserLabelList")
        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList userLabelList;

        public static QueryBizItemListV2ResponseBodyItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItemSkuListSku self = new QueryBizItemListV2ResponseBodyItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setGradePriceModels(QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels gradePriceModels) {
            this.gradePriceModels = gradePriceModels;
            return this;
        }
        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuGradePriceModels getGradePriceModels() {
            return this.gradePriceModels;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setTaoBaoCurrentPrice(Long taoBaoCurrentPrice) {
            this.taoBaoCurrentPrice = taoBaoCurrentPrice;
            return this;
        }
        public Long getTaoBaoCurrentPrice() {
            return this.taoBaoCurrentPrice;
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuListSku setUserLabelList(QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList userLabelList) {
            this.userLabelList = userLabelList;
            return this;
        }
        public QueryBizItemListV2ResponseBodyItemListItemSkuListSkuUserLabelList getUserLabelList() {
            return this.userLabelList;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryBizItemListV2ResponseBodyItemListItemSkuListSku> sku;

        public static QueryBizItemListV2ResponseBodyItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItemSkuList self = new QueryBizItemListV2ResponseBodyItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItemSkuList setSku(java.util.List<QueryBizItemListV2ResponseBodyItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryBizItemListV2ResponseBodyItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemListItem extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CustomizedItemName")
        public String customizedItemName;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SkuList")
        public QueryBizItemListV2ResponseBodyItemListItemSkuList skuList;

        @NameInMap("TaobaoShopName")
        public String taobaoShopName;

        public static QueryBizItemListV2ResponseBodyItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemListItem self = new QueryBizItemListV2ResponseBodyItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemListItem setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setCustomizedItemName(String customizedItemName) {
            this.customizedItemName = customizedItemName;
            return this;
        }
        public String getCustomizedItemName() {
            return this.customizedItemName;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setSkuList(QueryBizItemListV2ResponseBodyItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryBizItemListV2ResponseBodyItemListItemSkuList getSkuList() {
            return this.skuList;
        }

        public QueryBizItemListV2ResponseBodyItemListItem setTaobaoShopName(String taobaoShopName) {
            this.taobaoShopName = taobaoShopName;
            return this;
        }
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

    }

    public static class QueryBizItemListV2ResponseBodyItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryBizItemListV2ResponseBodyItemListItem> item;

        public static QueryBizItemListV2ResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListV2ResponseBodyItemList self = new QueryBizItemListV2ResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListV2ResponseBodyItemList setItem(java.util.List<QueryBizItemListV2ResponseBodyItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBizItemListV2ResponseBodyItemListItem> getItem() {
            return this.item;
        }

    }

}
