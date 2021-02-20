// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Images")
    public DescribeAvailableResourceResponseBodyImages images;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportResources")
    public DescribeAvailableResourceResponseBodySupportResources supportResources;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAvailableResourceResponseBody setImages(DescribeAvailableResourceResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeAvailableResourceResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponseBody setSupportResources(DescribeAvailableResourceResponseBodySupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeAvailableResourceResponseBodySupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeAvailableResourceResponseBodyImagesImage extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        public static DescribeAvailableResourceResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyImagesImage self = new DescribeAvailableResourceResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAvailableResourceResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

    }

    public static class DescribeAvailableResourceResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeAvailableResourceResponseBodyImagesImage> image;

        public static DescribeAvailableResourceResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyImages self = new DescribeAvailableResourceResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyImages setImage(java.util.List<DescribeAvailableResourceResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportResourcesSupportResource extends TeaModel {
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("SupportResourcesCount")
        public String supportResourcesCount;

        @NameInMap("SystemDiskSize")
        public String systemDiskSize;

        public static DescribeAvailableResourceResponseBodySupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportResourcesSupportResource self = new DescribeAvailableResourceResponseBodySupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportResourcesSupportResource setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeAvailableResourceResponseBodySupportResourcesSupportResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeAvailableResourceResponseBodySupportResourcesSupportResource setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeAvailableResourceResponseBodySupportResourcesSupportResource setSupportResourcesCount(String supportResourcesCount) {
            this.supportResourcesCount = supportResourcesCount;
            return this;
        }
        public String getSupportResourcesCount() {
            return this.supportResourcesCount;
        }

        public DescribeAvailableResourceResponseBodySupportResourcesSupportResource setSystemDiskSize(String systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeAvailableResourceResponseBodySupportResources extends TeaModel {
        @NameInMap("SupportResource")
        public java.util.List<DescribeAvailableResourceResponseBodySupportResourcesSupportResource> supportResource;

        public static DescribeAvailableResourceResponseBodySupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodySupportResources self = new DescribeAvailableResourceResponseBodySupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodySupportResources setSupportResource(java.util.List<DescribeAvailableResourceResponseBodySupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodySupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
