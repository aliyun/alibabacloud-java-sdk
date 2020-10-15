// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Images")
    @Validation(required = true)
    public DescribeAvailableResourceResponseImages images;

    @NameInMap("SupportResources")
    @Validation(required = true)
    public DescribeAvailableResourceResponseSupportResources supportResources;

    public static DescribeAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponse self = new DescribeAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAvailableResourceResponse setImages(DescribeAvailableResourceResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeAvailableResourceResponseImages getImages() {
        return this.images;
    }

    public DescribeAvailableResourceResponse setSupportResources(DescribeAvailableResourceResponseSupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeAvailableResourceResponseSupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeAvailableResourceResponseImagesImage extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        public static DescribeAvailableResourceResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseImagesImage self = new DescribeAvailableResourceResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAvailableResourceResponseImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

    }

    public static class DescribeAvailableResourceResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseImagesImage> image;

        public static DescribeAvailableResourceResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseImages self = new DescribeAvailableResourceResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseImages setImage(java.util.List<DescribeAvailableResourceResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseImagesImage> getImage() {
            return this.image;
        }

    }

    public static class DescribeAvailableResourceResponseSupportResourcesSupportResource extends TeaModel {
        @NameInMap("DataDiskSize")
        @Validation(required = true)
        public String dataDiskSize;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("SupportResourcesCount")
        @Validation(required = true)
        public String supportResourcesCount;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("SystemDiskSize")
        @Validation(required = true)
        public String systemDiskSize;

        public static DescribeAvailableResourceResponseSupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseSupportResourcesSupportResource self = new DescribeAvailableResourceResponseSupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseSupportResourcesSupportResource setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeAvailableResourceResponseSupportResourcesSupportResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeAvailableResourceResponseSupportResourcesSupportResource setSupportResourcesCount(String supportResourcesCount) {
            this.supportResourcesCount = supportResourcesCount;
            return this;
        }
        public String getSupportResourcesCount() {
            return this.supportResourcesCount;
        }

        public DescribeAvailableResourceResponseSupportResourcesSupportResource setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeAvailableResourceResponseSupportResourcesSupportResource setSystemDiskSize(String systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeAvailableResourceResponseSupportResources extends TeaModel {
        @NameInMap("SupportResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseSupportResourcesSupportResource> supportResource;

        public static DescribeAvailableResourceResponseSupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseSupportResources self = new DescribeAvailableResourceResponseSupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseSupportResources setSupportResource(java.util.List<DescribeAvailableResourceResponseSupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseSupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
