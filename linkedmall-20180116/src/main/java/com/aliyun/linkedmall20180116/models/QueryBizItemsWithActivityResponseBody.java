// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ItemList")
    public QueryBizItemsWithActivityResponseBodyItemList itemList;

    @NameInMap("Code")
    public String code;

    public static QueryBizItemsWithActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityResponseBody self = new QueryBizItemsWithActivityResponseBody();
        return TeaModel.build(map, self);
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

    public QueryBizItemsWithActivityResponseBody setItemList(QueryBizItemsWithActivityResponseBodyItemList itemList) {
        this.itemList = itemList;
        return this;
    }
    public QueryBizItemsWithActivityResponseBodyItemList getItemList() {
        return this.itemList;
    }

    public QueryBizItemsWithActivityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku extends TeaModel {
        @NameInMap("Status")
        public Long status;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("PointsInfo")
        public String pointsInfo;

        @NameInMap("MaxAllowedCount")
        public Integer maxAllowedCount;

        @NameInMap("PointsKey")
        public String pointsKey;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("Quantity")
        public Long quantity;

        public static QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku self = new QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPointsInfo(String pointsInfo) {
            this.pointsInfo = pointsInfo;
            return this;
        }
        public String getPointsInfo() {
            return this.pointsInfo;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setPointsKey(String pointsKey) {
            this.pointsKey = pointsKey;
            return this;
        }
        public String getPointsKey() {
            return this.pointsKey;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
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

        public QueryBizItemsWithActivityResponseBodyItemListItemSkuListSku setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
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

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku extends TeaModel {
        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("ActivityPrice")
        public Long activityPrice;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuListActivityItemSku setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
            return this;
        }
        public Long getActivityPrice() {
            return this.activityPrice;
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
        @NameInMap("LimitQuantityForPerson")
        public Long limitQuantityForPerson;

        @NameInMap("ActivityQuantity")
        public Long activityQuantity;

        @NameInMap("ActivityItemSkuList")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList activityItemSkuList;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem setLimitQuantityForPerson(Long limitQuantityForPerson) {
            this.limitQuantityForPerson = limitQuantityForPerson;
            return this;
        }
        public Long getLimitQuantityForPerson() {
            return this.limitQuantityForPerson;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem setActivityQuantity(Long activityQuantity) {
            this.activityQuantity = activityQuantity;
            return this;
        }
        public Long getActivityQuantity() {
            return this.activityQuantity;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItem setActivityItemSkuList(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList activityItemSkuList) {
            this.activityItemSkuList = activityItemSkuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivityItemActivityItemSkuList getActivityItemSkuList() {
            return this.activityItemSkuList;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList extends TeaModel {
        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList();
            return TeaModel.build(map, self);
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

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem extends TeaModel {
        @NameInMap("LimitQuantityForPerson")
        public Long limitQuantityForPerson;

        @NameInMap("SaleableQuantity")
        public Long saleableQuantity;

        @NameInMap("SessionQuantity")
        public Long sessionQuantity;

        @NameInMap("ActivitySessionItemSkuList")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList activitySessionItemSkuList;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem();
            return TeaModel.build(map, self);
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

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem setActivitySessionItemSkuList(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList activitySessionItemSkuList) {
            this.activitySessionItemSkuList = activitySessionItemSkuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItemActivitySessionItemSkuList getActivitySessionItemSkuList() {
            return this.activitySessionItemSkuList;
        }

    }

    public static class QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession extends TeaModel {
        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("DisplayDate")
        public Long displayDate;

        @NameInMap("LmSessionId")
        public Long lmSessionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ActivitySessionItem")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem activitySessionItem;

        @NameInMap("StartDate")
        public Long startDate;

        @NameInMap("Title")
        public String title;

        public static QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession self = new QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setDisplayDate(Long displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public Long getDisplayDate() {
            return this.displayDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setActivitySessionItem(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem activitySessionItem) {
            this.activitySessionItem = activitySessionItem;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySessionActivitySessionItem getActivitySessionItem() {
            return this.activitySessionItem;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessionsActivitySession setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
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

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("ActivitySessions")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions activitySessions;

        @NameInMap("StartDate")
        public Long startDate;

        @NameInMap("LmActivityId")
        public Long lmActivityId;

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

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setActivitySessions(QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions activitySessions) {
            this.activitySessions = activitySessions;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivityActivitySessions getActivitySessions() {
            return this.activitySessions;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItemActivitiesActivity setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
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

    public static class QueryBizItemsWithActivityResponseBodyItemListItem extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuList")
        public QueryBizItemsWithActivityResponseBodyItemListItemSkuList skuList;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Activities")
        public QueryBizItemsWithActivityResponseBodyItemListItemActivities activities;

        @NameInMap("TaobaoShopName")
        public String taobaoShopName;

        @NameInMap("TotalSoldQuantity")
        public Integer totalSoldQuantity;

        @NameInMap("MaxAllowedCount")
        public Integer maxAllowedCount;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("Quantity")
        public Long quantity;

        public static QueryBizItemsWithActivityResponseBodyItemListItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBizItemsWithActivityResponseBodyItemListItem self = new QueryBizItemsWithActivityResponseBodyItemListItem();
            return TeaModel.build(map, self);
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setSkuList(QueryBizItemsWithActivityResponseBodyItemListItemSkuList skuList) {
            this.skuList = skuList;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemSkuList getSkuList() {
            return this.skuList;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setActivities(QueryBizItemsWithActivityResponseBodyItemListItemActivities activities) {
            this.activities = activities;
            return this;
        }
        public QueryBizItemsWithActivityResponseBodyItemListItemActivities getActivities() {
            return this.activities;
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

        public QueryBizItemsWithActivityResponseBodyItemListItem setMaxAllowedCount(Integer maxAllowedCount) {
            this.maxAllowedCount = maxAllowedCount;
            return this;
        }
        public Integer getMaxAllowedCount() {
            return this.maxAllowedCount;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryBizItemsWithActivityResponseBodyItemListItem setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
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
