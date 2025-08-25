// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class ListImageCachesResponseBody extends TeaModel {
    @NameInMap("ImageCaches")
    public java.util.List<ListImageCachesResponseBodyImageCaches> imageCaches;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0E234675-3465-4CC3-9D0F-9A864BC*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListImageCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageCachesResponseBody self = new ListImageCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageCachesResponseBody setImageCaches(java.util.List<ListImageCachesResponseBodyImageCaches> imageCaches) {
        this.imageCaches = imageCaches;
        return this;
    }
    public java.util.List<ListImageCachesResponseBodyImageCaches> getImageCaches() {
        return this.imageCaches;
    }

    public ListImageCachesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImageCachesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImageCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageCachesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListImageCachesResponseBodyImageCaches extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-**-**T07:55:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>imc-bp1dj*****</p>
         */
        @NameInMap("ImageCacheId")
        public String imageCacheId;

        /**
         * <strong>example:</strong>
         * <p>my-imc</p>
         */
        @NameInMap("ImageCacheName")
        public String imageCacheName;

        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <strong>example:</strong>
         * <p>2025-**-**T07:58:25Z</p>
         */
        @NameInMap("ReadyTime")
        public String readyTime;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzh43v*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListImageCachesResponseBodyImageCaches build(java.util.Map<String, ?> map) throws Exception {
            ListImageCachesResponseBodyImageCaches self = new ListImageCachesResponseBodyImageCaches();
            return TeaModel.build(map, self);
        }

        public ListImageCachesResponseBodyImageCaches setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListImageCachesResponseBodyImageCaches setImageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }
        public String getImageCacheId() {
            return this.imageCacheId;
        }

        public ListImageCachesResponseBodyImageCaches setImageCacheName(String imageCacheName) {
            this.imageCacheName = imageCacheName;
            return this;
        }
        public String getImageCacheName() {
            return this.imageCacheName;
        }

        public ListImageCachesResponseBodyImageCaches setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public ListImageCachesResponseBodyImageCaches setReadyTime(String readyTime) {
            this.readyTime = readyTime;
            return this;
        }
        public String getReadyTime() {
            return this.readyTime;
        }

        public ListImageCachesResponseBodyImageCaches setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListImageCachesResponseBodyImageCaches setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListImageCachesResponseBodyImageCaches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
