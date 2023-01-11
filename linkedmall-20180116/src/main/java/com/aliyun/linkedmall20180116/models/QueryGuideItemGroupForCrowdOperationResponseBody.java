// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupForCrowdOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryGuideItemGroupForCrowdOperationResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryGuideItemGroupForCrowdOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupForCrowdOperationResponseBody self = new QueryGuideItemGroupForCrowdOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setModel(java.util.List<QueryGuideItemGroupForCrowdOperationResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryGuideItemGroupForCrowdOperationResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryGuideItemGroupForCrowdOperationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryGuideItemGroupForCrowdOperationResponseBodyModel extends TeaModel {
        @NameInMap("AtmospherePicUrl")
        public String atmospherePicUrl;

        @NameInMap("CanSell")
        public Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        public java.util.Map<String, String> customizedAttributeMap;

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
        public java.util.List<Integer> tags;

        @NameInMap("WhitePicUrl")
        public String whitePicUrl;

        public static QueryGuideItemGroupForCrowdOperationResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryGuideItemGroupForCrowdOperationResponseBodyModel self = new QueryGuideItemGroupForCrowdOperationResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setAtmospherePicUrl(String atmospherePicUrl) {
            this.atmospherePicUrl = atmospherePicUrl;
            return this;
        }
        public String getAtmospherePicUrl() {
            return this.atmospherePicUrl;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setCustomizedAttributeMap(java.util.Map<String, String> customizedAttributeMap) {
            this.customizedAttributeMap = customizedAttributeMap;
            return this;
        }
        public java.util.Map<String, String> getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setPointPrice(Long pointPrice) {
            this.pointPrice = pointPrice;
            return this;
        }
        public Long getPointPrice() {
            return this.pointPrice;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setTags(java.util.List<Integer> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Integer> getTags() {
            return this.tags;
        }

        public QueryGuideItemGroupForCrowdOperationResponseBodyModel setWhitePicUrl(String whitePicUrl) {
            this.whitePicUrl = whitePicUrl;
            return this;
        }
        public String getWhitePicUrl() {
            return this.whitePicUrl;
        }

    }

}
