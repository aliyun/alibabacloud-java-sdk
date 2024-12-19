// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryActivityItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LmActivityItemModelList")
    public QueryActivityItemsResponseBodyLmActivityItemModelList lmActivityItemModelList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>539E5C68-D8B5-57EC-9D9B-58AFD9E0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1990</p>
         */
        @NameInMap("ActivityPrice")
        public Long activityPrice;

        @NameInMap("ActivityStatus")
        public String activityStatus;

        /**
         * <strong>example:</strong>
         * <p>LMALL20211013****</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>64092072****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("LmActivityId")
        public Long lmActivityId;

        /**
         * <strong>example:</strong>
         * <p>10000035-63064613****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("ReservedPrice")
        public Long reservedPrice;

        /**
         * <p>skuID</p>
         * 
         * <strong>example:</strong>
         * <p>478531731****</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanSell")
        public Boolean canSell;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ItemActivityQuantity")
        public Integer itemActivityQuantity;

        @NameInMap("ItemActivityStatus")
        public String itemActivityStatus;

        /**
         * <strong>example:</strong>
         * <p>65332479****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("LmActivityId")
        public Long lmActivityId;

        /**
         * <strong>example:</strong>
         * <p>10006138-63786616****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>1002****</p>
         */
        @NameInMap("LmShopId")
        public String lmShopId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SellableQuantity")
        public Integer sellableQuantity;

        @NameInMap("SkuModelList")
        public QueryActivityItemsResponseBodyLmActivityItemModelListLmActivityItemModelSkuModelList skuModelList;

        /**
         * <strong>example:</strong>
         * <p>285278****</p>
         */
        @NameInMap("TbSellerId")
        public Long tbSellerId;

        /**
         * <strong>example:</strong>
         * <p>13089****</p>
         */
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
