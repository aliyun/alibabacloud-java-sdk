// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeImagesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListServerIdeImagesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListServerIdeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeImagesResponseBody self = new ListServerIdeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerIdeImagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerIdeImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerIdeImagesResponseBody setPagingInfo(ListServerIdeImagesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListServerIdeImagesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListServerIdeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServerIdeImagesResponseBodyPagingInfoImages extends TeaModel {
        /**
         * <p>The image ID used by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>System_serveride_notebook_20240822</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>serveride_notebook</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/example/serveride:latest</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The image status.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListServerIdeImagesResponseBodyPagingInfoImages build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeImagesResponseBodyPagingInfoImages self = new ListServerIdeImagesResponseBodyPagingInfoImages();
            return TeaModel.build(map, self);
        }

        public ListServerIdeImagesResponseBodyPagingInfoImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListServerIdeImagesResponseBodyPagingInfoImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListServerIdeImagesResponseBodyPagingInfoImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListServerIdeImagesResponseBodyPagingInfoImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListServerIdeImagesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of images available for personal development environments.</p>
         */
        @NameInMap("Images")
        public java.util.List<ListServerIdeImagesResponseBodyPagingInfoImages> images;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListServerIdeImagesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeImagesResponseBodyPagingInfo self = new ListServerIdeImagesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListServerIdeImagesResponseBodyPagingInfo setImages(java.util.List<ListServerIdeImagesResponseBodyPagingInfoImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<ListServerIdeImagesResponseBodyPagingInfoImages> getImages() {
            return this.images;
        }

        public ListServerIdeImagesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListServerIdeImagesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListServerIdeImagesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
