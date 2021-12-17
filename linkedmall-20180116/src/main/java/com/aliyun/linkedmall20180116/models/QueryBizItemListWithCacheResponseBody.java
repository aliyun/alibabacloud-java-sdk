// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListWithCacheResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // model
    @NameInMap("ItemList")
    public java.util.List<QueryBizItemListWithCacheResponseBodyItemList> itemList;

    // message
    @NameInMap("Message")
    public String message;

    // pageNumber
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    // totalCount
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryBizItemListWithCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListWithCacheResponseBody self = new QueryBizItemListWithCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListWithCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBizItemListWithCacheResponseBody setItemList(java.util.List<QueryBizItemListWithCacheResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryBizItemListWithCacheResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public QueryBizItemListWithCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBizItemListWithCacheResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemListWithCacheResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemListWithCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBizItemListWithCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBizItemListWithCacheResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryBizItemListWithCacheResponseBodyItemList extends TeaModel {
        // 商品是否可售卖
        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("ItemId")
        public Long itemId;

        // 商品名称
        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemId")
        public String lmItemId;

        // 商品主图
        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        // 用户支付价格:分
        @NameInMap("PointPrice")
        public Long pointPrice;

        // 积分，单位：个
        @NameInMap("Points")
        public Long points;

        // 积分抵扣的金额，单位：分
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        // 渠道售价，单位：分
        @NameInMap("PriceCent")
        public Long priceCent;

        // 商品原价（元）
        @NameInMap("ReservePrice")
        public Long reservePrice;

        // 商品状态。1-商品可售；2-商品下架；3-价格异常；4-商品删除
        @NameInMap("Status")
        public Long status;

        public static QueryBizItemListWithCacheResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemListWithCacheResponseBodyItemList self = new QueryBizItemListWithCacheResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemListWithCacheResponseBodyItemList setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemListWithCacheResponseBodyItemList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
