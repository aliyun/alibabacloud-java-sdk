// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupByItemStateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GuideItemGroup")
    public java.util.List<QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup> guideItemGroup;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGuideItemGroupByItemStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupByItemStateResponseBody self = new QueryGuideItemGroupByItemStateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupByItemStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupByItemStateResponseBody setGuideItemGroup(java.util.List<QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup> guideItemGroup) {
        this.guideItemGroup = guideItemGroup;
        return this;
    }
    public java.util.List<QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup> getGuideItemGroup() {
        return this.guideItemGroup;
    }

    public QueryGuideItemGroupByItemStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupByItemStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupByItemStateResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryGuideItemGroupByItemStateResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryGuideItemGroupByItemStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

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

        public static QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup self = new QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupByItemStateResponseBodyGuideItemGroup setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

    }

}
