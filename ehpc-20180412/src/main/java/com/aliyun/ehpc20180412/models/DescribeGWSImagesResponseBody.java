// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public DescribeGWSImagesResponseBodyImages images;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGWSImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSImagesResponseBody self = new DescribeGWSImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSImagesResponseBody setImages(DescribeGWSImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeGWSImagesResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeGWSImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGWSImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGWSImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGWSImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGWSImagesResponseBodyImagesImageInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Status")
        public String status;

        public static DescribeGWSImagesResponseBodyImagesImageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSImagesResponseBodyImagesImageInfo self = new DescribeGWSImagesResponseBodyImagesImageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeGWSImagesResponseBodyImagesImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGWSImagesResponseBodyImages extends TeaModel {
        @NameInMap("ImageInfo")
        public java.util.List<DescribeGWSImagesResponseBodyImagesImageInfo> imageInfo;

        public static DescribeGWSImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSImagesResponseBodyImages self = new DescribeGWSImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeGWSImagesResponseBodyImages setImageInfo(java.util.List<DescribeGWSImagesResponseBodyImagesImageInfo> imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }
        public java.util.List<DescribeGWSImagesResponseBodyImagesImageInfo> getImageInfo() {
            return this.imageInfo;
        }

    }

}
