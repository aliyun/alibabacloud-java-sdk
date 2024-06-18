// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageTagsResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<ListAcrImageTagsResponseBodyImages> images;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>ey14..</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>FEF343B9-1A15-5789-BE88-7B36190F5BF6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAcrImageTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAcrImageTagsResponseBody self = new ListAcrImageTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAcrImageTagsResponseBody setImages(java.util.List<ListAcrImageTagsResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListAcrImageTagsResponseBodyImages> getImages() {
        return this.images;
    }

    public ListAcrImageTagsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAcrImageTagsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAcrImageTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAcrImageTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAcrImageTagsResponseBodyImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>188394616</p>
         */
        @NameInMap("ImageSize")
        public String imageSize;

        /**
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>5.7.2</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ListAcrImageTagsResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListAcrImageTagsResponseBodyImages self = new ListAcrImageTagsResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListAcrImageTagsResponseBodyImages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAcrImageTagsResponseBodyImages setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
        }

        public ListAcrImageTagsResponseBodyImages setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAcrImageTagsResponseBodyImages setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
