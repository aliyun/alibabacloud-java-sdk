// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupWithOutInventoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("ItemList")
    @Validation(required = true)
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseItemList> itemList;

    public static QueryGuideItemGroupWithOutInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupWithOutInventoryResponse self = new QueryGuideItemGroupWithOutInventoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupWithOutInventoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setItemList(java.util.List<QueryGuideItemGroupWithOutInventoryResponseItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseItemList> getItemList() {
        return this.itemList;
    }

    public static class QueryGuideItemGroupWithOutInventoryResponseItemList extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("MainPicUrl")
        @Validation(required = true)
        public String mainPicUrl;

        @NameInMap("ItemUrl")
        @Validation(required = true)
        public String itemUrl;

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
        public String reservePrice;

        @NameInMap("CustomizedAttributeMap")
        @Validation(required = true)
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("WhitePicUrl")
        @Validation(required = true)
        public String whitePicUrl;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<String> tags;

        public static QueryGuideItemGroupWithOutInventoryResponseItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupWithOutInventoryResponseItemList self = new QueryGuideItemGroupWithOutInventoryResponseItemList();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setWhitePicUrl(String whitePicUrl) {
            this.whitePicUrl = whitePicUrl;
            return this;
        }
        public String getWhitePicUrl() {
            return this.whitePicUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseItemList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
