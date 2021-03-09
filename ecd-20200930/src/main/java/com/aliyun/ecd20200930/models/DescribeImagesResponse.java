// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagesResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Images")
    @Validation(required = true)
    public java.util.List<DescribeImagesResponseImages> images;

    public static DescribeImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponse self = new DescribeImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponse setImages(java.util.List<DescribeImagesResponseImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeImagesResponseImages> getImages() {
        return this.images;
    }

    public static class DescribeImagesResponseImages extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageType")
        @Validation(required = true)
        public String imageType;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("DataDiskSize")
        @Validation(required = true)
        public Integer dataDiskSize;

        @NameInMap("GpuCategory")
        @Validation(required = true)
        public Boolean gpuCategory;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("OsType")
        @Validation(required = true)
        public String osType;

        public static DescribeImagesResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseImages self = new DescribeImagesResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeImagesResponseImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagesResponseImages setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeImagesResponseImages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeImagesResponseImages setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeImagesResponseImages setGpuCategory(Boolean gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Boolean getGpuCategory() {
            return this.gpuCategory;
        }

        public DescribeImagesResponseImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImagesResponseImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagesResponseImages setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

    }

}
