// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupWithOutInventoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> itemList;

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

    public static QueryGuideItemGroupWithOutInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupWithOutInventoryResponseBody self = new QueryGuideItemGroupWithOutInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setItemList(java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryGuideItemGroupWithOutInventoryResponseBodyItemList extends TeaModel {
        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("PointPrice")
        public Long pointPrice;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("ReservePrice")
        public String reservePrice;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("WhitePicUrl")
        public String whitePicUrl;

        public static QueryGuideItemGroupWithOutInventoryResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupWithOutInventoryResponseBodyItemList self = new QueryGuideItemGroupWithOutInventoryResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setWhitePicUrl(String whitePicUrl) {
            this.whitePicUrl = whitePicUrl;
            return this;
        }
        public String getWhitePicUrl() {
            return this.whitePicUrl;
        }

    }

}
