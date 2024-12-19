// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemList")
    public QueryBizItemsWithActivityResponseBodyItemList itemList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1A0D9B6B-EBEA-5B7C-B10D-C4455F842637</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryBizItemsWithActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityResponseBody self = new QueryBizItemsWithActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsWithActivityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBizItemsWithActivityResponseBody setItemList(QueryBizItemsWithActivityResponseBodyItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryBizItemsWithActivityResponseBodyItemList getItemList() {
        return this.itemList;
    }

    public QueryBizItemsWithActivityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBizItemsWithActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>990</p>
         */
        @NameInMap("ActivityPrice")
        public Long activityPrice;

        /**
         * <p>skuId</p>
         * 
         * <strong>example:</strong>
         * <p>471******57</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
            return this;
        }
        public Long getActivityPrice() {
            return this.activityPrice;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList extends TeaModel {
        @NameInMap("ActivityItemSku")
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku> activityItemSku;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList setActivityItemSku(java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku> activityItemSku) {
            this.activityItemSku = activityItemSku;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku> getActivityItemSku() {
            return this.activityItemSku;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem extends TeaModel {
        @NameInMap("ActivityItemSkuList")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList activityItemSkuList;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ActivityQuantity")
        public Long activityQuantity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitQuantityForPerson")
        public Long limitQuantityForPerson;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem setActivityItemSkuList(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList activityItemSkuList) {
            this.activityItemSkuList = activityItemSkuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList getActivityItemSkuList() {
            return this.activityItemSkuList;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem setActivityQuantity(Long activityQuantity) {
            this.activityQuantity = activityQuantity;
            return this;
        }
        public Long getActivityQuantity() {
            return this.activityQuantity;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem setLimitQuantityForPerson(Long limitQuantityForPerson) {
            this.limitQuantityForPerson = limitQuantityForPerson;
            return this;
        }
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>159</p>
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
         * <p>2990</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <p>skuId</p>
         * 
         * <strong>example:</strong>
         * <p>471******57</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem extends TeaModel {
        @NameInMap("ActivitySessionItemSkuList")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList activitySessionItemSkuList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LimitQuantityForPerson")
        public Long limitQuantityForPerson;

        /**
         * <strong>example:</strong>
         * <p>888</p>
         */
        @NameInMap("SaleableQuantity")
        public Long saleableQuantity;

        /**
         * <strong>example:</strong>
         * <p>888</p>
         */
        @NameInMap("SessionQuantity")
        public Long sessionQuantity;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setActivitySessionItemSkuList(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList activitySessionItemSkuList) {
            this.activitySessionItemSkuList = activitySessionItemSkuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList getActivitySessionItemSkuList() {
            return this.activitySessionItemSkuList;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setLimitQuantityForPerson(Long limitQuantityForPerson) {
            this.limitQuantityForPerson = limitQuantityForPerson;
            return this;
        }
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setSaleableQuantity(Long saleableQuantity) {
            this.saleableQuantity = saleableQuantity;
            return this;
        }
        public Long getSaleableQuantity() {
            return this.saleableQuantity;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setSessionQuantity(Long sessionQuantity) {
            this.sessionQuantity = sessionQuantity;
            return this;
        }
        public Long getSessionQuantity() {
            return this.sessionQuantity;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession extends TeaModel {
        @NameInMap("ActivitySessionItem")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem activitySessionItem;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1633412800000</p>
         */
        @NameInMap("DisplayDate")
        public Long displayDate;

        /**
         * <strong>example:</strong>
         * <p>1639412800000</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <strong>example:</strong>
         * <p>329</p>
         */
        @NameInMap("LmSessionId")
        public Long lmSessionId;

        /**
         * <strong>example:</strong>
         * <p>1634412800000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        /**
         * <strong>example:</strong>
         * <p>5fbbd94******4345f6c37166fb</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("Title")
        public String title;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setActivitySessionItem(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem activitySessionItem) {
            this.activitySessionItem = activitySessionItem;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem getActivitySessionItem() {
            return this.activitySessionItem;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setDisplayDate(Long displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public Long getDisplayDate() {
            return this.displayDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions extends TeaModel {
        @NameInMap("ActivitySession")
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession> activitySession;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions setActivitySession(java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession> activitySession) {
            this.activitySession = activitySession;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession> getActivitySession() {
            return this.activitySession;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity extends TeaModel {
        @NameInMap("ActivityItem")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem activityItem;

        @NameInMap("ActivitySessions")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions activitySessions;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1642412800000</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("LmActivityId")
        public Long lmActivityId;

        /**
         * <strong>example:</strong>
         * <p>1632412800000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        @NameInMap("Title")
        public String title;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setActivityItem(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem activityItem) {
            this.activityItem = activityItem;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem getActivityItem() {
            return this.activityItem;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setActivitySessions(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions activitySessions) {
            this.activitySessions = activitySessions;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions getActivitySessions() {
            return this.activitySessions;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivities extends TeaModel {
        @NameInMap("Activity")
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity> activity;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivities build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivities self = new QueryBizItemsWithActivityResponseBodyItemListItemActivities();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivities setActivity(java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity> activity) {
            this.activity = activity;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity> getActivity() {
            return this.activity;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxAllowedCount")
        public Integer maxAllowedCount;

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

        @NameInMap("PointsInfo")
        public String pointsInfo;

        @NameInMap("PointsKey")
        public String pointsKey;

        /**
         * <strong>example:</strong>
         * <p>2790</p>
         */
        @NameInMap("PriceCent")
        public Long priceCent;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>skuId</p>
         * 
         * <strong>example:</strong>
         * <p>472266643****</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        public static QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku self = new QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPointsInfo(String pointsInfo) {
            this.pointsInfo = pointsInfo;
            return this;
        }
        public String getPointsInfo() {
            return this.pointsInfo;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPointsKey(String pointsKey) {
            this.pointsKey = pointsKey;
            return this;
        }
        public String getPointsKey() {
            return this.pointsKey;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku> sku;

        public static QueryBizItemsWithActivityResponseBodyItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemSkuList self = new QueryBizItemsWithActivityResponseBodyItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuList setSku(java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItem extends TeaModel {
        @NameInMap("Activities")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivities activities;

        /**
         * <strong>example:</strong>
         * <p>50018977</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>60716881****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p>10000230-60716881****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaxAllowedCount")
        public Integer maxAllowedCount;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/******.jpg">https://img.alicdn.com/******.jpg</a></p>
         */
        @NameInMap("PicUrl")
        public String picUrl;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <strong>example:</strong>
         * <p>2990</p>
         */
        @NameInMap("ReservePrice")
        public Long reservePrice;

        /**
         * <strong>example:</strong>
         * <p>284324****</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("SkuList")
        public QueryBizItemsWithActivityResponseBodyItemListItemSkuList skuList;

        @NameInMap("TaobaoShopName")
        public String taobaoShopName;

        /**
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("TotalSoldQuantity")
        public Integer totalSoldQuantity;

        public static QueryBizItemsWithActivityResponseBodyItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItem self = new QueryBizItemsWithActivityResponseBodyItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setActivities(QueryBizItemsWithActivityResponseBodyItemListItemActivities activities) {
            this.activities = activities;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivities getActivities() {
            return this.activities;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setSkuList(QueryBizItemsWithActivityResponseBodyItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemSkuList getSkuList() {
            return this.skuList;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setTaobaoShopName(String taobaoShopName) {
            this.taobaoShopName = taobaoShopName;
            return this;
        }
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemList extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItem> item;

        public static QueryBizItemsWithActivityResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemList self = new QueryBizItemsWithActivityResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemList setItem(java.util.List<QueryBizItemsWithActivityResponseBodyItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseBodyItemListItem> getItem() {
            return this.item;
        }

    }

}
