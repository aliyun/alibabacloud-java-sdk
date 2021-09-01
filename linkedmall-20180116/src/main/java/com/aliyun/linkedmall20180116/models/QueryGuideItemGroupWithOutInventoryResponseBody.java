// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupWithOutInventoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("ItemList")
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> itemList;

    public static QueryGuideItemGroupWithOutInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupWithOutInventoryResponseBody self = new QueryGuideItemGroupWithOutInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryGuideItemGroupWithOutInventoryResponseBody setItemList(java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public static class QueryGuideItemGroupWithOutInventoryResponseBodyItemList extends TeaModel {
        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PointPrice")
        public Long pointPrice;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("WhitePicUrl")
        public String whitePicUrl;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("Points")
        public Long points;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("ReservePrice")
        public String reservePrice;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, ?> customizedAttributeMap;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static QueryGuideItemGroupWithOutInventoryResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupWithOutInventoryResponseBodyItemList self = new QueryGuideItemGroupWithOutInventoryResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setWhitePicUrl(String whitePicUrl) {
            this.whitePicUrl = whitePicUrl;
            return this;
        }
        public String getWhitePicUrl() {
            return this.whitePicUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setCustomizedAttributeMap(java.util.Map<String, ?> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, ?> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryGuideItemGroupWithOutInventoryResponseBodyItemList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
