// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the image.</p>
     */
    @NameInMap("Images")
    public DescribeAvailableResourceInfoResponseBodyImages images;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8629F679-B51D-4194-A1CC-5D8F504C362B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The specifications of resources that you can purchase.</p>
     */
    @NameInMap("SupportResources")
    public DescribeAvailableResourceInfoResponseBodySupportResources supportResources;

    public static DescribeAvailableResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceInfoResponseBody self = new DescribeAvailableResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceInfoResponseBody setImages(DescribeAvailableResourceInfoResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeAvailableResourceInfoResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeAvailableResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceInfoResponseBody setSupportResources(DescribeAvailableResourceInfoResponseBodySupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeAvailableResourceInfoResponseBodySupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeAvailableResourceInfoResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_a****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_a****</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The size of the image. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ImageSize")
        public Integer imageSize;

        public static DescribeAvailableResourceInfoResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodyImagesImage self = new DescribeAvailableResourceInfoResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAvailableResourceInfoResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeAvailableResourceInfoResponseBodyImagesImage setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Integer getImageSize() {
            return this.imageSize;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeAvailableResourceInfoResponseBodyImagesImage> image;

        public static DescribeAvailableResourceInfoResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodyImages self = new DescribeAvailableResourceInfoResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodyImages setImage(java.util.List<DescribeAvailableResourceInfoResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeAvailableResourceInfoResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes extends TeaModel {
        @NameInMap("BandwidthType")
        public java.util.List<String> bandwidthType;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes setBandwidthType(java.util.List<String> bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public java.util.List<String> getBandwidthType() {
            return this.bandwidthType;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds extends TeaModel {
        @NameInMap("EnsRegionId")
        public java.util.List<String> ensRegionId;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds setEnsRegionId(java.util.List<String> ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public java.util.List<String> getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId extends TeaModel {
        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>EastChina</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The name. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>EnName</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom-4</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The information about the Internet service provider (ISP).</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The name of the edge node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The province.</p>
         */
        @NameInMap("Province")
        public String province;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends extends TeaModel {
        @NameInMap("EnsRegionId")
        public java.util.List<DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId> ensRegionId;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends setEnsRegionId(java.util.List<DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId> ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public java.util.List<DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId> getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces extends TeaModel {
        @NameInMap("InstanceSpec")
        public java.util.List<String> instanceSpec;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces setInstanceSpec(java.util.List<String> instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public java.util.List<String> getInstanceSpec() {
            return this.instanceSpec;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp extends TeaModel {
        @NameInMap("Isp")
        public java.util.List<String> isp;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp setIsp(java.util.List<String> isp) {
            this.isp = isp;
            return this;
        }
        public java.util.List<String> getIsp() {
            return this.isp;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource extends TeaModel {
        @NameInMap("BandwidthTypes")
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes bandwidthTypes;

        /**
         * <p>The maximum capacity of a data disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DataDiskMaxSize")
        public Integer dataDiskMaxSize;

        /**
         * <p>The minimum data disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataDiskMinSize")
        public Integer dataDiskMinSize;

        @NameInMap("EnsRegionIds")
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds ensRegionIds;

        /**
         * <p>The supplementary information about the edge nodes.</p>
         */
        @NameInMap("EnsRegionIdsExtends")
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends ensRegionIdsExtends;

        @NameInMap("InstanceSpeces")
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces instanceSpeces;

        @NameInMap("Isp")
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp isp;

        /**
         * <p>The maximum size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskMaxSize")
        public Integer systemDiskMaxSize;

        /**
         * <p>The minimum capacity of a system disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SystemDiskMinSize")
        public Integer systemDiskMinSize;

        public static DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource self = new DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setBandwidthTypes(DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes bandwidthTypes) {
            this.bandwidthTypes = bandwidthTypes;
            return this;
        }
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceBandwidthTypes getBandwidthTypes() {
            return this.bandwidthTypes;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setDataDiskMaxSize(Integer dataDiskMaxSize) {
            this.dataDiskMaxSize = dataDiskMaxSize;
            return this;
        }
        public Integer getDataDiskMaxSize() {
            return this.dataDiskMaxSize;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setDataDiskMinSize(Integer dataDiskMinSize) {
            this.dataDiskMinSize = dataDiskMinSize;
            return this;
        }
        public Integer getDataDiskMinSize() {
            return this.dataDiskMinSize;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setEnsRegionIds(DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds ensRegionIds) {
            this.ensRegionIds = ensRegionIds;
            return this;
        }
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIds getEnsRegionIds() {
            return this.ensRegionIds;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setEnsRegionIdsExtends(DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends ensRegionIdsExtends) {
            this.ensRegionIdsExtends = ensRegionIdsExtends;
            return this;
        }
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceEnsRegionIdsExtends getEnsRegionIdsExtends() {
            return this.ensRegionIdsExtends;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setInstanceSpeces(DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces instanceSpeces) {
            this.instanceSpeces = instanceSpeces;
            return this;
        }
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceInstanceSpeces getInstanceSpeces() {
            return this.instanceSpeces;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setIsp(DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp isp) {
            this.isp = isp;
            return this;
        }
        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResourceIsp getIsp() {
            return this.isp;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setSystemDiskMaxSize(Integer systemDiskMaxSize) {
            this.systemDiskMaxSize = systemDiskMaxSize;
            return this;
        }
        public Integer getSystemDiskMaxSize() {
            return this.systemDiskMaxSize;
        }

        public DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource setSystemDiskMinSize(Integer systemDiskMinSize) {
            this.systemDiskMinSize = systemDiskMinSize;
            return this;
        }
        public Integer getSystemDiskMinSize() {
            return this.systemDiskMinSize;
        }

    }

    public static class DescribeAvailableResourceInfoResponseBodySupportResources extends TeaModel {
        @NameInMap("SupportResource")
        public java.util.List<DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource> supportResource;

        public static DescribeAvailableResourceInfoResponseBodySupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseBodySupportResources self = new DescribeAvailableResourceInfoResponseBodySupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseBodySupportResources setSupportResource(java.util.List<DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceInfoResponseBodySupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
