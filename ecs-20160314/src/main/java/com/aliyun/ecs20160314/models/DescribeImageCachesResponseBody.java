// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeImageCachesResponseBody extends TeaModel {
    @NameInMap("ImageCaches")
    public ImageCaches imageCaches;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesResponseBody self = new DescribeImageCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCachesResponseBody setImageCaches(ImageCaches imageCaches) {
        this.imageCaches = imageCaches;
        return this;
    }
    public ImageCaches getImageCaches() {
        return this.imageCaches;
    }

    public DescribeImageCachesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCachesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ImageCache extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static ImageCache build(java.util.Map<String, ?> map) throws Exception {
            ImageCache self = new ImageCache();
            return TeaModel.build(map, self);
        }

        public ImageCache setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ImageCache setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ImageCache setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ImageCache setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ImageCaches extends TeaModel {
        @NameInMap("ImageCache")
        public java.util.List<ImageCache> imageCache;

        public static ImageCaches build(java.util.Map<String, ?> map) throws Exception {
            ImageCaches self = new ImageCaches();
            return TeaModel.build(map, self);
        }

        public ImageCaches setImageCache(java.util.List<ImageCache> imageCache) {
            this.imageCache = imageCache;
            return this;
        }
        public java.util.List<ImageCache> getImageCache() {
            return this.imageCache;
        }

    }

}
