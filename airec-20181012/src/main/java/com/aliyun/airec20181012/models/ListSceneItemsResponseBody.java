// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListSceneItemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListSceneItemsResponseBodyResult result;

    public static ListSceneItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSceneItemsResponseBody self = new ListSceneItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSceneItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSceneItemsResponseBody setResult(ListSceneItemsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSceneItemsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSceneItemsResponseBodyResultTotal extends TeaModel {
        @NameInMap("WeightItem")
        public Long weightItem;

        @NameInMap("InstanceRecommendItem")
        public Long instanceRecommendItem;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("SceneRecommendItem")
        public Long sceneRecommendItem;

        @NameInMap("SceneWeightItem")
        public Long sceneWeightItem;

        public static ListSceneItemsResponseBodyResultTotal build(java.util.Map<String, ?> map) throws Exception {
            ListSceneItemsResponseBodyResultTotal self = new ListSceneItemsResponseBodyResultTotal();
            return TeaModel.build(map, self);
        }

        public ListSceneItemsResponseBodyResultTotal setWeightItem(Long weightItem) {
            this.weightItem = weightItem;
            return this;
        }
        public Long getWeightItem() {
            return this.weightItem;
        }

        public ListSceneItemsResponseBodyResultTotal setInstanceRecommendItem(Long instanceRecommendItem) {
            this.instanceRecommendItem = instanceRecommendItem;
            return this;
        }
        public Long getInstanceRecommendItem() {
            return this.instanceRecommendItem;
        }

        public ListSceneItemsResponseBodyResultTotal setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListSceneItemsResponseBodyResultTotal setSceneRecommendItem(Long sceneRecommendItem) {
            this.sceneRecommendItem = sceneRecommendItem;
            return this;
        }
        public Long getSceneRecommendItem() {
            return this.sceneRecommendItem;
        }

        public ListSceneItemsResponseBodyResultTotal setSceneWeightItem(Long sceneWeightItem) {
            this.sceneWeightItem = sceneWeightItem;
            return this;
        }
        public Long getSceneWeightItem() {
            return this.sceneWeightItem;
        }

    }

    public static class ListSceneItemsResponseBodyResultDetail extends TeaModel {
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

        public static ListSceneItemsResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSceneItemsResponseBodyResultDetail self = new ListSceneItemsResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public ListSceneItemsResponseBodyResultDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSceneItemsResponseBodyResultDetail setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListSceneItemsResponseBodyResultDetail setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListSceneItemsResponseBodyResultDetail setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListSceneItemsResponseBodyResultDetail setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListSceneItemsResponseBodyResultDetail setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
            return this;
        }
        public String getCategoryPath() {
            return this.categoryPath;
        }

        public ListSceneItemsResponseBodyResultDetail setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListSceneItemsResponseBodyResultDetail setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public ListSceneItemsResponseBodyResultDetail setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public ListSceneItemsResponseBodyResultDetail setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListSceneItemsResponseBodyResultDetail setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListSceneItemsResponseBodyResultDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListSceneItemsResponseBodyResult extends TeaModel {
        @NameInMap("Total")
        public ListSceneItemsResponseBodyResultTotal total;

        @NameInMap("Detail")
        public java.util.List<ListSceneItemsResponseBodyResultDetail> detail;

        public static ListSceneItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSceneItemsResponseBodyResult self = new ListSceneItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSceneItemsResponseBodyResult setTotal(ListSceneItemsResponseBodyResultTotal total) {
            this.total = total;
            return this;
        }
        public ListSceneItemsResponseBodyResultTotal getTotal() {
            return this.total;
        }

        public ListSceneItemsResponseBodyResult setDetail(java.util.List<ListSceneItemsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListSceneItemsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

    }

}
