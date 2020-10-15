// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeReservedResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Images")
    @Validation(required = true)
    public DescribeReservedResourceResponseImages images;

    @NameInMap("SupportResources")
    @Validation(required = true)
    public DescribeReservedResourceResponseSupportResources supportResources;

    public static DescribeReservedResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedResourceResponse self = new DescribeReservedResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedResourceResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeReservedResourceResponse setImages(DescribeReservedResourceResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeReservedResourceResponseImages getImages() {
        return this.images;
    }

    public DescribeReservedResourceResponse setSupportResources(DescribeReservedResourceResponseSupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeReservedResourceResponseSupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeReservedResourceResponseImagesImage extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        public static DescribeReservedResourceResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseImagesImage self = new DescribeReservedResourceResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeReservedResourceResponseImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

    }

    public static class DescribeReservedResourceResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeReservedResourceResponseImagesImage> image;

        public static DescribeReservedResourceResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseImages self = new DescribeReservedResourceResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseImages setImage(java.util.List<DescribeReservedResourceResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeReservedResourceResponseImagesImage> getImage() {
            return this.image;
        }

    }

    public static class DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes extends TeaModel {
        // SystemDiskSize
        @NameInMap("SystemDiskSize")
        @Validation(required = true)
        public java.util.List<String> systemDiskSize;

        public static DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes self = new DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes setSystemDiskSize(java.util.List<String> systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public java.util.List<String> getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes extends TeaModel {
        // DataDiskSize
        @NameInMap("DataDiskSize")
        @Validation(required = true)
        public java.util.List<String> dataDiskSize;

        public static DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes self = new DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes setDataDiskSize(java.util.List<String> dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public java.util.List<String> getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

    public static class DescribeReservedResourceResponseSupportResourcesSupportResource extends TeaModel {
        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("SupportResourcesCount")
        @Validation(required = true)
        public String supportResourcesCount;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("SystemDiskSizes")
        @Validation(required = true)
        public DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes systemDiskSizes;

        @NameInMap("DataDiskSizes")
        @Validation(required = true)
        public DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes dataDiskSizes;

        public static DescribeReservedResourceResponseSupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseSupportResourcesSupportResource self = new DescribeReservedResourceResponseSupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResource setSupportResourcesCount(String supportResourcesCount) {
            this.supportResourcesCount = supportResourcesCount;
            return this;
        }
        public String getSupportResourcesCount() {
            return this.supportResourcesCount;
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResource setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResource setSystemDiskSizes(DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes systemDiskSizes) {
            this.systemDiskSizes = systemDiskSizes;
            return this;
        }
        public DescribeReservedResourceResponseSupportResourcesSupportResourceSystemDiskSizes getSystemDiskSizes() {
            return this.systemDiskSizes;
        }

        public DescribeReservedResourceResponseSupportResourcesSupportResource setDataDiskSizes(DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes dataDiskSizes) {
            this.dataDiskSizes = dataDiskSizes;
            return this;
        }
        public DescribeReservedResourceResponseSupportResourcesSupportResourceDataDiskSizes getDataDiskSizes() {
            return this.dataDiskSizes;
        }

    }

    public static class DescribeReservedResourceResponseSupportResources extends TeaModel {
        @NameInMap("SupportResource")
        @Validation(required = true)
        public java.util.List<DescribeReservedResourceResponseSupportResourcesSupportResource> supportResource;

        public static DescribeReservedResourceResponseSupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseSupportResources self = new DescribeReservedResourceResponseSupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseSupportResources setSupportResource(java.util.List<DescribeReservedResourceResponseSupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeReservedResourceResponseSupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
