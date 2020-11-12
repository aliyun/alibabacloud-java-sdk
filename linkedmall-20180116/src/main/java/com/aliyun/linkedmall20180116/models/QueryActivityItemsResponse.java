// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryActivityItemsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("LmActivityItemModelList")
    @Validation(required = true)
    public QueryActivityItemsResponseLmActivityItemModelList lmActivityItemModelList;

    public static QueryActivityItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityItemsResponse self = new QueryActivityItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryActivityItemsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryActivityItemsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryActivityItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryActivityItemsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryActivityItemsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryActivityItemsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryActivityItemsResponse setLmActivityItemModelList(QueryActivityItemsResponseLmActivityItemModelList lmActivityItemModelList) {
        this.lmActivityItemModelList = lmActivityItemModelList;
        return this;
    }
    public QueryActivityItemsResponseLmActivityItemModelList getLmActivityItemModelList() {
        return this.lmActivityItemModelList;
    }

    public static class QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SkuTitle")
        @Validation(required = true)
        public String skuTitle;

        @NameInMap("SkuPicUrl")
        @Validation(required = true)
        public String skuPicUrl;

        @NameInMap("ReservedPrice")
        @Validation(required = true)
        public Long reservedPrice;

        @NameInMap("ActivityPrice")
        @Validation(required = true)
        public Long activityPrice;

        @NameInMap("ActivityStatus")
        @Validation(required = true)
        public String activityStatus;

        @NameInMap("Tips")
        @Validation(required = true)
        public String tips;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        public static QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel self = new QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setReservedPrice(Long reservedPrice) {
            this.reservedPrice = reservedPrice;
            return this;
        }
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
            return this;
        }
        public Long getActivityPrice() {
            return this.activityPrice;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setActivityStatus(String activityStatus) {
            this.activityStatus = activityStatus;
            return this;
        }
        public String getActivityStatus() {
            return this.activityStatus;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

    }

    public static class QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList extends TeaModel {
        @NameInMap("LmActivityItemSkuModel")
        @Validation(required = true)
        public java.util.List<QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel> lmActivityItemSkuModel;

        public static QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList self = new QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList setLmActivityItemSkuModel(java.util.List<QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel> lmActivityItemSkuModel) {
            this.lmActivityItemSkuModel = lmActivityItemSkuModel;
            return this;
        }
        public java.util.List<QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelListLmActivityItemSkuModel> getLmActivityItemSkuModel() {
            return this.lmActivityItemSkuModel;
        }

    }

    public static class QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel extends TeaModel {
        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        @NameInMap("MainPicUrl")
        @Validation(required = true)
        public String mainPicUrl;

        @NameInMap("TbSellerId")
        @Validation(required = true)
        public Long tbSellerId;

        @NameInMap("TbShopId")
        @Validation(required = true)
        public Long tbShopId;

        @NameInMap("LmShopId")
        @Validation(required = true)
        public String lmShopId;

        @NameInMap("TbShopName")
        @Validation(required = true)
        public String tbShopName;

        @NameInMap("ItemActivityQuantity")
        @Validation(required = true)
        public Integer itemActivityQuantity;

        @NameInMap("SellableQuantity")
        @Validation(required = true)
        public Integer sellableQuantity;

        @NameInMap("ItemActivityStatus")
        @Validation(required = true)
        public String itemActivityStatus;

        @NameInMap("CanSell")
        @Validation(required = true)
        public Boolean canSell;

        @NameInMap("Tips")
        @Validation(required = true)
        public String tips;

        @NameInMap("SkuModelList")
        @Validation(required = true)
        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList skuModelList;

        public static QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel self = new QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setTbSellerId(Long tbSellerId) {
            this.tbSellerId = tbSellerId;
            return this;
        }
        public Long getTbSellerId() {
            return this.tbSellerId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setTbShopId(Long tbShopId) {
            this.tbShopId = tbShopId;
            return this;
        }
        public Long getTbShopId() {
            return this.tbShopId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setLmShopId(String lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }
        public String getLmShopId() {
            return this.lmShopId;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setItemActivityQuantity(Integer itemActivityQuantity) {
            this.itemActivityQuantity = itemActivityQuantity;
            return this;
        }
        public Integer getItemActivityQuantity() {
            return this.itemActivityQuantity;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setSellableQuantity(Integer sellableQuantity) {
            this.sellableQuantity = sellableQuantity;
            return this;
        }
        public Integer getSellableQuantity() {
            return this.sellableQuantity;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setItemActivityStatus(String itemActivityStatus) {
            this.itemActivityStatus = itemActivityStatus;
            return this;
        }
        public String getItemActivityStatus() {
            return this.itemActivityStatus;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel setSkuModelList(QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList skuModelList) {
            this.skuModelList = skuModelList;
            return this;
        }
        public QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModelSkuModelList getSkuModelList() {
            return this.skuModelList;
        }

    }

    public static class QueryActivityItemsResponseLmActivityItemModelList extends TeaModel {
        @NameInMap("LmActivityItemModel")
        @Validation(required = true)
        public java.util.List<QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel> lmActivityItemModel;

        public static QueryActivityItemsResponseLmActivityItemModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseLmActivityItemModelList self = new QueryActivityItemsResponseLmActivityItemModelList();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseLmActivityItemModelList setLmActivityItemModel(java.util.List<QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel> lmActivityItemModel) {
            this.lmActivityItemModel = lmActivityItemModel;
            return this;
        }
        public java.util.List<QueryActivityItemsResponseLmActivityItemModelListLmActivityItemModel> getLmActivityItemModel() {
            return this.lmActivityItemModel;
        }

    }

}
