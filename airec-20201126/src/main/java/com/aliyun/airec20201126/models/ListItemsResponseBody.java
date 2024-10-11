// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6839AE7C-A984-48C1-AC17-331BAC6D97BC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
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

    public static class ListItemsResponseBodyResultDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("brandId")
        public String brandId;

        /**
         * <strong>example:</strong>
         * <p>1_2</p>
         */
        @NameInMap("categoryPath")
        public String categoryPath;

        /**
         * <strong>example:</strong>
         * <p>news</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>1647998107012</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>1647998107012</p>
         */
        @NameInMap("pubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("shopId")
        public String shopId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        public static ListItemsResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            ListItemsResponseBodyResultDetail self = new ListItemsResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public ListItemsResponseBodyResultDetail setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListItemsResponseBodyResultDetail setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public ListItemsResponseBodyResultDetail setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
            return this;
        }
        public String getCategoryPath() {
            return this.categoryPath;
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

        public ListItemsResponseBodyResultDetail setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListItemsResponseBodyResultDetail setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListItemsResponseBodyResultDetail setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListItemsResponseBodyResultDetail setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListItemsResponseBodyResultDetail setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public ListItemsResponseBodyResultDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListItemsResponseBodyResultDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListItemsResponseBodyResultTotal extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("instanceRecommendItem")
        public Long instanceRecommendItem;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("queryCount")
        public Long queryCount;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("sceneRecommendItem")
        public Long sceneRecommendItem;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("sceneWeightItem")
        public Long sceneWeightItem;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("weightItem")
        public Long weightItem;

        public static ListItemsResponseBodyResultTotal build(java.util.Map<String, ?> map) throws Exception {
            ListItemsResponseBodyResultTotal self = new ListItemsResponseBodyResultTotal();
            return TeaModel.build(map, self);
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

        public ListItemsResponseBodyResultTotal setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListItemsResponseBodyResultTotal setWeightItem(Long weightItem) {
            this.weightItem = weightItem;
            return this;
        }
        public Long getWeightItem() {
            return this.weightItem;
        }

    }

    public static class ListItemsResponseBodyResult extends TeaModel {
        @NameInMap("detail")
        public java.util.List<ListItemsResponseBodyResultDetail> detail;

        @NameInMap("total")
        public ListItemsResponseBodyResultTotal total;

        public static ListItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListItemsResponseBodyResult self = new ListItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListItemsResponseBodyResult setDetail(java.util.List<ListItemsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListItemsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

        public ListItemsResponseBodyResult setTotal(ListItemsResponseBodyResultTotal total) {
            this.total = total;
            return this;
        }
        public ListItemsResponseBodyResultTotal getTotal() {
            return this.total;
        }

    }

}
