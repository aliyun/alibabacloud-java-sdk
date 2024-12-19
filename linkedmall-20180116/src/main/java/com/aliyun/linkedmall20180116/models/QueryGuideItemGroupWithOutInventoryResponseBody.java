// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupWithOutInventoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public java.util.List<QueryGuideItemGroupWithOutInventoryResponseBodyItemList> itemList;

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
     * <p>A7BE4356-7F92-533E-A31B-2EBF2D67****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>62785263****</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p><a href="https://detail.tmall.com/item.htm?id=670600584601&spm=a21y2.8291224.2879496.9.c6e23569FJRVmu&skuId=500049906">https://detail.tmall.com/item.htm?id=670600584601&amp;spm=a21y2.8291224.2879496.9.c6e23569FJRVmu&amp;skuId=500049906</a>****</p>
         */
        @NameInMap("ItemUrl")
        public String itemUrl;

        /**
         * <strong>example:</strong>
         * <p>10006515-64348848****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        /**
         * <strong>example:</strong>
         * <p>4990</p>
         */
        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>4990</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>5990</p>
         */
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
