// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeReservedResourceResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the image.</p>
     */
    @NameInMap("Images")
    public DescribeReservedResourceResponseBodyImages images;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources.</p>
     */
    @NameInMap("SupportResources")
    public DescribeReservedResourceResponseBodySupportResources supportResources;

    public static DescribeReservedResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedResourceResponseBody self = new DescribeReservedResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeReservedResourceResponseBody setImages(DescribeReservedResourceResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeReservedResourceResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeReservedResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedResourceResponseBody setSupportResources(DescribeReservedResourceResponseBodySupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeReservedResourceResponseBodySupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeReservedResourceResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_****</p>
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

        public static DescribeReservedResourceResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseBodyImagesImage self = new DescribeReservedResourceResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeReservedResourceResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

    }

    public static class DescribeReservedResourceResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeReservedResourceResponseBodyImagesImage> image;

        public static DescribeReservedResourceResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseBodyImages self = new DescribeReservedResourceResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseBodyImages setImage(java.util.List<DescribeReservedResourceResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeReservedResourceResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

    public static class DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes extends TeaModel {
        @NameInMap("DataDiskSize")
        public java.util.List<String> dataDiskSize;

        public static DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes self = new DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes setDataDiskSize(java.util.List<String> dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public java.util.List<String> getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

    public static class DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes extends TeaModel {
        @NameInMap("SystemDiskSize")
        public java.util.List<String> systemDiskSize;

        public static DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes self = new DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes setSystemDiskSize(java.util.List<String> systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public java.util.List<String> getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeReservedResourceResponseBodySupportResourcesSupportResource extends TeaModel {
        /**
         * <p>The sizes of data disks.</p>
         */
        @NameInMap("DataDiskSizes")
        public DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes dataDiskSizes;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The specifications of instances.</p>
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
         * <p>The sizes of system disks.</p>
         */
        @NameInMap("SystemDiskSizes")
        public DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes systemDiskSizes;

        public static DescribeReservedResourceResponseBodySupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseBodySupportResourcesSupportResource self = new DescribeReservedResourceResponseBodySupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResource setDataDiskSizes(DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes dataDiskSizes) {
            this.dataDiskSizes = dataDiskSizes;
            return this;
        }
        public DescribeReservedResourceResponseBodySupportResourcesSupportResourceDataDiskSizes getDataDiskSizes() {
            return this.dataDiskSizes;
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResource setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResource setSupportResourcesCount(String supportResourcesCount) {
            this.supportResourcesCount = supportResourcesCount;
            return this;
        }
        public String getSupportResourcesCount() {
            return this.supportResourcesCount;
        }

        public DescribeReservedResourceResponseBodySupportResourcesSupportResource setSystemDiskSizes(DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes systemDiskSizes) {
            this.systemDiskSizes = systemDiskSizes;
            return this;
        }
        public DescribeReservedResourceResponseBodySupportResourcesSupportResourceSystemDiskSizes getSystemDiskSizes() {
            return this.systemDiskSizes;
        }

    }

    public static class DescribeReservedResourceResponseBodySupportResources extends TeaModel {
        @NameInMap("SupportResource")
        public java.util.List<DescribeReservedResourceResponseBodySupportResourcesSupportResource> supportResource;

        public static DescribeReservedResourceResponseBodySupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedResourceResponseBodySupportResources self = new DescribeReservedResourceResponseBodySupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeReservedResourceResponseBodySupportResources setSupportResource(java.util.List<DescribeReservedResourceResponseBodySupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeReservedResourceResponseBodySupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
