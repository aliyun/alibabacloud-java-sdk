// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the images.</p>
     */
    @NameInMap("Images")
    public DescribeAvailableResourceResponseBodyImages images;

    /**
     * <p>The ID of the request. This is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The specifications of resources that you can purchase.</p>
     */
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
        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_20171208</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_****</p>
         */
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
        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The specifications of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.stiny</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The number of resources that you can purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("SupportResourcesCount")
        public String supportResourcesCount;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
