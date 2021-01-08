// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListItemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListItemsResponseBodyResult result;

    public static ListItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListItemsResponseBody self = new ListItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListItemsResponseBody setResult(ListItemsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListItemsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListItemsResponseBodyResultTotal extends TeaModel {
        @NameInMap("WeightItem")
        public Long weightItem;

        @NameInMap("InstanceRecommendItem")
        public Long instanceRecommendItem;

        @NameInMap("QueryCount")
        public Long queryCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("SceneRecommendItem")
        public Long sceneRecommendItem;

        @NameInMap("SceneWeightItem")
        public Long sceneWeightItem;

        public static ListItemsResponseBodyResultTotal build(java.util.Map<String, ?> map) throws Exception {
            ListItemsResponseBodyResultTotal self = new ListItemsResponseBodyResultTotal();
            return TeaModel.build(map, self);
        }

        public ListItemsResponseBodyResultTotal setWeightItem(Long weightItem) {
            this.weightItem = weightItem;
            return this;
        }
        public Long getWeightItem() {
            return this.weightItem;
        }

        public ListItemsResponseBodyResultTotal setInstanceRecommendItem(Long instanceRecommendItem) {
            this.instanceRecommendItem = instanceRecommendItem;
            return this;
        }
        public Long getInstanceRecommendItem() {
            return this.instanceRecommendItem;
        }

        public ListItemsResponseBodyResultTotal setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public ListItemsResponseBodyResultTotal setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListItemsResponseBodyResultTotal setSceneRecommendItem(Long sceneRecommendItem) {
            this.sceneRecommendItem = sceneRecommendItem;
            return this;
        }
        public Long getSceneRecommendItem() {
            return this.sceneRecommendItem;
        }

        public ListItemsResponseBodyResultTotal setSceneWeightItem(Long sceneWeightItem) {
            this.sceneWeightItem = sceneWeightItem;
            return this;
        }
        public Long getSceneWeightItem() {
            return this.sceneWeightItem;
        }

    }

    public static class ListItemsResponseBodyResultDetail extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Author")
        public String author;

        @NameInMap("CategoryPath")
        public String categoryPath;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("BrandId")
        public String brandId;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Title")
        public String title;

        public static ListItemsResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            ListItemsResponseBodyResultDetail self = new ListItemsResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public ListItemsResponseBodyResultDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListItemsResponseBodyResultDetail setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListItemsResponseBodyResultDetail setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListItemsResponseBodyResultDetail setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListItemsResponseBodyResultDetail setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListItemsResponseBodyResultDetail setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
            return this;
        }
        public String getCategoryPath() {
            return this.categoryPath;
        }

        public ListItemsResponseBodyResultDetail setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListItemsResponseBodyResultDetail setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public ListItemsResponseBodyResultDetail setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public ListItemsResponseBodyResultDetail setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListItemsResponseBodyResultDetail setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListItemsResponseBodyResultDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListItemsResponseBodyResult extends TeaModel {
        @NameInMap("Total")
        public ListItemsResponseBodyResultTotal total;

        @NameInMap("Detail")
        public java.util.List<ListItemsResponseBodyResultDetail> detail;

        public static ListItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListItemsResponseBodyResult self = new ListItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListItemsResponseBodyResult setTotal(ListItemsResponseBodyResultTotal total) {
            this.total = total;
            return this;
        }
        public ListItemsResponseBodyResultTotal getTotal() {
            return this.total;
        }

        public ListItemsResponseBodyResult setDetail(java.util.List<ListItemsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListItemsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

    }

}
