// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("GuideItemGroup")
    @Validation(required = true)
    public QueryGuideItemGroupResponseGuideItemGroup guideItemGroup;

    public static QueryGuideItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupResponse self = new QueryGuideItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryGuideItemGroupResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryGuideItemGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryGuideItemGroupResponse setGuideItemGroup(QueryGuideItemGroupResponseGuideItemGroup guideItemGroup) {
        this.guideItemGroup = guideItemGroup;
        return this;
    }
    public QueryGuideItemGroupResponseGuideItemGroup getGuideItemGroup() {
        return this.guideItemGroup;
    }

    public static class QueryGuideItemGroupResponseGuideItemGroupItemInfo extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

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

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public String reservePrice;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        @NameInMap("PointPrice")
        @Validation(required = true)
        public Long pointPrice;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        public static QueryGuideItemGroupResponseGuideItemGroupItemInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupResponseGuideItemGroupItemInfo self = new QueryGuideItemGroupResponseGuideItemGroupItemInfo();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupResponseGuideItemGroupItemInfo setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

    }

    public static class QueryGuideItemGroupResponseGuideItemGroup extends TeaModel {
        @NameInMap("ItemInfo")
        @Validation(required = true)
        public java.util.List<QueryGuideItemGroupResponseGuideItemGroupItemInfo> itemInfo;

        public static QueryGuideItemGroupResponseGuideItemGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupResponseGuideItemGroup self = new QueryGuideItemGroupResponseGuideItemGroup();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupResponseGuideItemGroup setItemInfo(java.util.List<QueryGuideItemGroupResponseGuideItemGroupItemInfo> itemInfo) {
            this.itemInfo = itemInfo;
            return this;
        }
        public java.util.List<QueryGuideItemGroupResponseGuideItemGroupItemInfo> getItemInfo() {
            return this.itemInfo;
        }

    }

}
