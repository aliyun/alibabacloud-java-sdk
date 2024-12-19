// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("GuideItemGroup")
    public QueryGuideItemGroupResponseBodyGuideItemGroup guideItemGroup;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1B82570B-7167-5D41-A74F-CD8DC2C54A49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>205</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryGuideItemGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupResponseBody self = new QueryGuideItemGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupResponseBody setGuideItemGroup(QueryGuideItemGroupResponseBodyGuideItemGroup guideItemGroup) {
        this.guideItemGroup = guideItemGroup;
        return this;
    }
    public QueryGuideItemGroupResponseBodyGuideItemGroup getGuideItemGroup() {
        return this.guideItemGroup;
    }

    public QueryGuideItemGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryGuideItemGroupResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryGuideItemGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>66******1055</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("ItemUrl")
        public String itemUrl;

        /**
         * <strong>example:</strong>
         * <p>10001036-******0492928</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        /**
         * <strong>example:</strong>
         * <p>990</p>
         */
        @NameInMap("PointPrice")
        public Long pointPrice;

        /**
         * <strong>example:</strong>
         * <p>69</p>
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
         * <p>990</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>20.0</p>
         */
        @NameInMap("ReservePrice")
        public String reservePrice;

        public static QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo self = new QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

    }

    public static class QueryGuideItemGroupResponseBodyGuideItemGroup extends TeaModel {
        @NameInMap("ItemInfo")
        public java.util.List<QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo> itemInfo;

        public static QueryGuideItemGroupResponseBodyGuideItemGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupResponseBodyGuideItemGroup self = new QueryGuideItemGroupResponseBodyGuideItemGroup();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupResponseBodyGuideItemGroup setItemInfo(java.util.List<QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo> itemInfo) {
            this.itemInfo = itemInfo;
            return this;
        }
        public java.util.List<QueryGuideItemGroupResponseBodyGuideItemGroupItemInfo> getItemInfo() {
            return this.itemInfo;
        }

    }

}
