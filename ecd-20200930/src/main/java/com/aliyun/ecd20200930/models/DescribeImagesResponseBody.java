// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Images")
    public java.util.List<DescribeImagesResponseBodyImages> images;

    public static DescribeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponseBody self = new DescribeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponseBody setImages(java.util.List<DescribeImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public static class DescribeImagesResponseBodyImages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("Name")
        public String name;

        @NameInMap("GpuCategory")
        public Boolean gpuCategory;

        @NameInMap("ImageId")
        public String imageId;

        public static DescribeImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImages self = new DescribeImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseBodyImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeImagesResponseBodyImages setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseBodyImages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImages setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeImagesResponseBodyImages setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeImagesResponseBodyImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagesResponseBodyImages setGpuCategory(Boolean gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Boolean getGpuCategory() {
            return this.gpuCategory;
        }

        public DescribeImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

}
