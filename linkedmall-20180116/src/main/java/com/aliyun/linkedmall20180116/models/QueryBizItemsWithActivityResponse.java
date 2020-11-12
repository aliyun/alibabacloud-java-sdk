// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ItemList")
    @Validation(required = true)
    public QueryBizItemsWithActivityResponseItemList itemList;

    public static QueryBizItemsWithActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityResponse self = new QueryBizItemsWithActivityResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsWithActivityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBizItemsWithActivityResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBizItemsWithActivityResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBizItemsWithActivityResponse setItemList(QueryBizItemsWithActivityResponseItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryBizItemsWithActivityResponseItemList getItemList() {
        return this.itemList;
    }

    public static class QueryBizItemsWithActivityResponseItemListItemSkuListSku extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("PriceCent")
        @Validation(required = true)
        public Long priceCent;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        @NameInMap("PointsKey")
        @Validation(required = true)
        public String pointsKey;

        @NameInMap("PointsInfo")
        @Validation(required = true)
        public String pointsInfo;

        @NameInMap("MaxAllowedCount")
        @Validation(required = true)
        public Integer maxAllowedCount;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Long quantity;

        public static QueryBizItemsWithActivityResponseItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemSkuListSku self = new QueryBizItemsWithActivityResponseItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setPointsKey(String pointsKey) {
            this.pointsKey = pointsKey;
            return this;
        }
        public String getPointsKey() {
            return this.pointsKey;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setPointsInfo(String pointsInfo) {
            this.pointsInfo = pointsInfo;
            return this;
        }
        public String getPointsInfo() {
            return this.pointsInfo;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuListSku setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemSkuList extends TeaModel {
        @NameInMap("Sku")
        @Validation(required = true)
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemSkuListSku> sku;

        public static QueryBizItemsWithActivityResponseItemListItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemSkuList self = new QueryBizItemsWithActivityResponseItemListItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemSkuList setSku(java.util.List<QueryBizItemsWithActivityResponseItemListItemSkuListSku> sku) {
            this.sku = sku;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemSkuListSku> getSku() {
            return this.sku;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("PriceCent")
        @Validation(required = true)
        public Long priceCent;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem extends TeaModel {
        @NameInMap("SessionQuantity")
        @Validation(required = true)
        public Long sessionQuantity;

        @NameInMap("LimitQuantityForPerson")
        @Validation(required = true)
        public Long limitQuantityForPerson;

        @NameInMap("SaleableQuantity")
        @Validation(required = true)
        public Long saleableQuantity;

        @NameInMap("ActivitySessionItemSkuList")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList activitySessionItemSkuList;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setSessionQuantity(Long sessionQuantity) {
            this.sessionQuantity = sessionQuantity;
            return this;
        }
        public Long getSessionQuantity() {
            return this.sessionQuantity;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setLimitQuantityForPerson(Long limitQuantityForPerson) {
            this.limitQuantityForPerson = limitQuantityForPerson;
            return this;
        }
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setSaleableQuantity(Long saleableQuantity) {
            this.saleableQuantity = saleableQuantity;
            return this;
        }
        public Long getSaleableQuantity() {
            return this.saleableQuantity;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setActivitySessionItemSkuList(QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList activitySessionItemSkuList) {
            this.activitySessionItemSkuList = activitySessionItemSkuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList getActivitySessionItemSkuList() {
            return this.activitySessionItemSkuList;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession extends TeaModel {
        @NameInMap("LmSessionId")
        @Validation(required = true)
        public Long lmSessionId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        @NameInMap("DisplayDate")
        @Validation(required = true)
        public Long displayDate;

        @NameInMap("StartDate")
        @Validation(required = true)
        public Long startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public Long endDate;

        @NameInMap("ActivitySessionItem")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem activitySessionItem;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setDisplayDate(Long displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public Long getDisplayDate() {
            return this.displayDate;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession setActivitySessionItem(QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem activitySessionItem) {
            this.activitySessionItem = activitySessionItem;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem getActivitySessionItem() {
            return this.activitySessionItem;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions extends TeaModel {
        @NameInMap("ActivitySession")
        @Validation(required = true)
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession> activitySession;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions setActivitySession(java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession> activitySession) {
            this.activitySession = activitySession;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessionsActivitySession> getActivitySession() {
            return this.activitySession;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("ActivityPrice")
        @Validation(required = true)
        public Long activityPrice;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
            return this;
        }
        public Long getActivityPrice() {
            return this.activityPrice;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList extends TeaModel {
        @NameInMap("ActivityItemSku")
        @Validation(required = true)
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku> activityItemSku;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList setActivityItemSku(java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku> activityItemSku) {
            this.activityItemSku = activityItemSku;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku> getActivityItemSku() {
            return this.activityItemSku;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem extends TeaModel {
        @NameInMap("ActivityQuantity")
        @Validation(required = true)
        public Long activityQuantity;

        @NameInMap("LimitQuantityForPerson")
        @Validation(required = true)
        public Long limitQuantityForPerson;

        @NameInMap("ActivityItemSkuList")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList activityItemSkuList;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem setActivityQuantity(Long activityQuantity) {
            this.activityQuantity = activityQuantity;
            return this;
        }
        public Long getActivityQuantity() {
            return this.activityQuantity;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem setLimitQuantityForPerson(Long limitQuantityForPerson) {
            this.limitQuantityForPerson = limitQuantityForPerson;
            return this;
        }
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem setActivityItemSkuList(QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList activityItemSkuList) {
            this.activityItemSkuList = activityItemSkuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItemActivityItemSkuList getActivityItemSkuList() {
            return this.activityItemSkuList;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivitiesActivity extends TeaModel {
        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StartDate")
        @Validation(required = true)
        public Long startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public Long endDate;

        @NameInMap("ActivitySessions")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions activitySessions;

        @NameInMap("ActivityItem")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem activityItem;

        public static QueryBizItemsWithActivityResponseItemListItemActivitiesActivity build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivitiesActivity self = new QueryBizItemsWithActivityResponseItemListItemActivitiesActivity();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setActivitySessions(QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions activitySessions) {
            this.activitySessions = activitySessions;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivitySessions getActivitySessions() {
            return this.activitySessions;
        }

        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivity setActivityItem(QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem activityItem) {
            this.activityItem = activityItem;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemActivitiesActivityActivityItem getActivityItem() {
            return this.activityItem;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItemActivities extends TeaModel {
        @NameInMap("Activity")
        @Validation(required = true)
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivity> activity;

        public static QueryBizItemsWithActivityResponseItemListItemActivities build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItemActivities self = new QueryBizItemsWithActivityResponseItemListItemActivities();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItemActivities setActivity(java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivity> activity) {
            this.activity = activity;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseItemListItemActivitiesActivity> getActivity() {
            return this.activity;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemListItem extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("ReservePrice")
        @Validation(required = true)
        public Long reservePrice;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("TaobaoShopName")
        @Validation(required = true)
        public String taobaoShopName;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Long quantity;

        @NameInMap("MaxAllowedCount")
        @Validation(required = true)
        public Integer maxAllowedCount;

        @NameInMap("TotalSoldQuantity")
        @Validation(required = true)
        public Integer totalSoldQuantity;

        @NameInMap("SkuList")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemSkuList skuList;

        @NameInMap("Activities")
        @Validation(required = true)
        public QueryBizItemsWithActivityResponseItemListItemActivities activities;

        public static QueryBizItemsWithActivityResponseItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemListItem self = new QueryBizItemsWithActivityResponseItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemsWithActivityResponseItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemsWithActivityResponseItemListItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemsWithActivityResponseItemListItem setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryBizItemsWithActivityResponseItemListItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemsWithActivityResponseItemListItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryBizItemsWithActivityResponseItemListItem setTaobaoShopName(String taobaoShopName) {
            this.taobaoShopName = taobaoShopName;
            return this;
        }
        public String getTaobaoShopName() {
            return this.taobaoShopName;
        }

        public QueryBizItemsWithActivityResponseItemListItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryBizItemsWithActivityResponseItemListItem setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public QueryBizItemsWithActivityResponseItemListItem setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public QueryBizItemsWithActivityResponseItemListItem setTotalSoldQuantity(Integer totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public QueryBizItemsWithActivityResponseItemListItem setSkuList(QueryBizItemsWithActivityResponseItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemSkuList getSkuList() {
            return this.skuList;
        }

        public QueryBizItemsWithActivityResponseItemListItem setActivities(QueryBizItemsWithActivityResponseItemListItemActivities activities) {
            this.activities = activities;
            return this;
        }
        public QueryBizItemsWithActivityResponseItemListItemActivities getActivities() {
            return this.activities;
        }

    }

    public static class QueryBizItemsWithActivityResponseItemList extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBizItemsWithActivityResponseItemListItem> item;

        public static QueryBizItemsWithActivityResponseItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseItemList self = new QueryBizItemsWithActivityResponseItemList();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseItemList setItem(java.util.List<QueryBizItemsWithActivityResponseItemListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBizItemsWithActivityResponseItemListItem> getItem() {
            return this.item;
        }

    }

}
