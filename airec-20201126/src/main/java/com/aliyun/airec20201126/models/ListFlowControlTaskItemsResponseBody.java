// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ListFlowControlTaskItemsResponseBodyResult result;

    public static ListFlowControlTaskItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskItemsResponseBody self = new ListFlowControlTaskItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlTaskItemsResponseBody setResult(ListFlowControlTaskItemsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListFlowControlTaskItemsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListFlowControlTaskItemsResponseBodyResultDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>12_34</p>
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
         * <p>18</p>
         */
        @NameInMap("duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>1612687809</p>
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
         * <p>video</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>1662346558</p>
         */
        @NameInMap("lastModifyTime")
        public String lastModifyTime;

        /**
         * <strong>example:</strong>
         * <p>1661931487</p>
         */
        @NameInMap("pubTime")
        public String pubTime;

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

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("weight")
        public String weight;

        public static ListFlowControlTaskItemsResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskItemsResponseBodyResultDetail self = new ListFlowControlTaskItemsResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
            return this;
        }
        public String getCategoryPath() {
            return this.categoryPath;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListFlowControlTaskItemsResponseBodyResultDetail setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class ListFlowControlTaskItemsResponseBodyResult extends TeaModel {
        @NameInMap("detail")
        public java.util.List<ListFlowControlTaskItemsResponseBodyResultDetail> detail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public String totalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("validCount")
        public String validCount;

        public static ListFlowControlTaskItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskItemsResponseBodyResult self = new ListFlowControlTaskItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskItemsResponseBodyResult setDetail(java.util.List<ListFlowControlTaskItemsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListFlowControlTaskItemsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

        public ListFlowControlTaskItemsResponseBodyResult setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListFlowControlTaskItemsResponseBodyResult setValidCount(String validCount) {
            this.validCount = validCount;
            return this;
        }
        public String getValidCount() {
            return this.validCount;
        }

    }

}
