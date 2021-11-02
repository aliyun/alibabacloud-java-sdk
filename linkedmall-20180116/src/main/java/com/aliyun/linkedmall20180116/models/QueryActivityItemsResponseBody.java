// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryActivityItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LmActivityItemModelList")
    public QueryActivityItemsResponseBodyLmActivityItemModelList lmActivityItemModelList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryActivityItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityItemsResponseBody self = new QueryActivityItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryActivityItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryActivityItemsResponseBody setLmActivityItemModelList(QueryActivityItemsResponseBodyLmActivityItemModelList lmActivityItemModelList) {
        this.lmActivityItemModelList = lmActivityItemModelList;
        return this;
    }
    public QueryActivityItemsResponseBodyLmActivityItemModelList getLmActivityItemModelList() {
        return this.lmActivityItemModelList;
    }

    public QueryActivityItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryActivityItemsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryActivityItemsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryActivityItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryActivityItemsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel extends TeaModel {
        @NameInMap("ActivityPrice")
        public Long activityPrice;

        @NameInMap("ActivityStatus")
        public String activityStatus;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmActivityId")
        public Long lmActivityId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuTitle")
        public String skuTitle;

        @NameInMap("Tips")
        public String tips;

        public static QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel self = new QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
            return this;
        }
        public Long getActivityPrice() {
            return this.activityPrice;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setActivityStatus(String activityStatus) {
            this.activityStatus = activityStatus;
            return this;
        }
        public String getActivityStatus() {
            return this.activityStatus;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList extends TeaModel {
        @NameInMap("LmActivityItemSkuModel")
        public java.util.List<QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel> lmActivityItemSkuModel;

        public static QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList self = new QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList setLmActivityItemSkuModel(java.util.List<QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel> lmActivityItemSkuModel) {
            this.lmActivityItemSkuModel = lmActivityItemSkuModel;
            return this;
        }
        public java.util.List<QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel> getLmActivityItemSkuModel() {
            return this.lmActivityItemSkuModel;
        }

    }

    public static class QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel extends TeaModel {
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("ItemActivityQuantity")
        public Integer itemActivityQuantity;

        @NameInMap("ItemActivityStatus")
        public String itemActivityStatus;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmActivityId")
        public Long lmActivityId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmShopId")
        public String lmShopId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("SellableQuantity")
        public Integer sellableQuantity;

        @NameInMap("SkuModelList")
        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList skuModelList;

        @NameInMap("TbSellerId")
        public Long tbSellerId;

        @NameInMap("TbShopId")
        public Long tbShopId;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("Tips")
        public String tips;

        public static QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel self = new QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setItemActivityQuantity(Integer itemActivityQuantity) {
            this.itemActivityQuantity = itemActivityQuantity;
            return this;
        }
        public Integer getItemActivityQuantity() {
            return this.itemActivityQuantity;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setItemActivityStatus(String itemActivityStatus) {
            this.itemActivityStatus = itemActivityStatus;
            return this;
        }
        public String getItemActivityStatus() {
            return this.itemActivityStatus;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setLmShopId(String lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public String getLmShopId() {
            return this.lmShopId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setSellableQuantity(Integer sellableQuantity) {
            this.sellableQuantity = sellableQuantity;
            return this;
        }
        public Integer getSellableQuantity() {
            return this.sellableQuantity;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setSkuModelList(QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList skuModelList) {
            this.skuModelList = skuModelList;
            return this;
        }
        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList getSkuModelList() {
            return this.skuModelList;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setTbShopId(Long tbShopId) {
            this.tbShopId = tbShopId;
            return this;
        }
        public Long getTbShopId() {
            return this.tbShopId;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class QueryActivityItemsResponseBodyLmActivityItemModelList extends TeaModel {
        @NameInMap("LmActivityItemModel")
        public java.util.List<QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel> lmActivityItemModel;

        public static QueryActivityItemsResponseBodyLmActivityItemModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyLmActivityItemModelList self = new QueryActivityItemsResponseBodyLmActivityItemModelList();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyLmActivityItemModelList setLmActivityItemModel(java.util.List<QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel> lmActivityItemModel) {
            this.lmActivityItemModel = lmActivityItemModel;
            return this;
        }
        public java.util.List<QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModel> getLmActivityItemModel() {
            return this.lmActivityItemModel;
        }

    }

}
