// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAICImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<DescribeAICImagesResponseBodyImages> images;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAICImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICImagesResponseBody self = new DescribeAICImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAICImagesResponseBody setImages(java.util.List<DescribeAICImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeAICImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public DescribeAICImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAICImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAICImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAICImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAICImagesResponseBodyImages extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("User")
        public String user;

        public static DescribeAICImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeAICImagesResponseBodyImages self = new DescribeAICImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeAICImagesResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAICImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAICImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAICImagesResponseBodyImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeAICImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAICImagesResponseBodyImages setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
