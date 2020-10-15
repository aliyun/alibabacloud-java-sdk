// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SupportResources")
    @Validation(required = true)
    public DescribeAvailableResourceInfoResponseSupportResources supportResources;

    @NameInMap("Images")
    @Validation(required = true)
    public DescribeAvailableResourceInfoResponseImages images;

    public static DescribeAvailableResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceInfoResponse self = new DescribeAvailableResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceInfoResponse setSupportResources(DescribeAvailableResourceInfoResponseSupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeAvailableResourceInfoResponseSupportResources getSupportResources() {
        return this.supportResources;
    }

    public DescribeAvailableResourceInfoResponse setImages(DescribeAvailableResourceInfoResponseImages images) {
        this.images = images;
        return this;
    }
    public DescribeAvailableResourceInfoResponseImages getImages() {
        return this.images;
    }

    public static class DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId extends TeaModel {
        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("EnName")
        @Validation(required = true)
        public String enName;

        @NameInMap("Area")
        @Validation(required = true)
        public String area;

        @NameInMap("Province")
        @Validation(required = true)
        public String province;

        public static DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId self = new DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends extends TeaModel {
        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId> ensRegionId;

        public static DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends self = new DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends setEnsRegionId(java.util.List<DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId> ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public java.util.List<DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtendsEnsRegionId> getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds extends TeaModel {
        // EnsRegionId
        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public java.util.List<String> ensRegionId;

        public static DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds self = new DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds setEnsRegionId(java.util.List<String> ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public java.util.List<String> getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces extends TeaModel {
        // InstanceSpec
        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public java.util.List<String> instanceSpec;

        public static DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces self = new DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces setInstanceSpec(java.util.List<String> instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public java.util.List<String> getInstanceSpec() {
            return this.instanceSpec;
        }

    }

    public static class DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes extends TeaModel {
        // BandwidthType
        @NameInMap("BandwidthType")
        @Validation(required = true)
        public java.util.List<String> bandwidthType;

        public static DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes self = new DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes setBandwidthType(java.util.List<String> bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public java.util.List<String> getBandwidthType() {
            return this.bandwidthType;
        }

    }

    public static class DescribeAvailableResourceInfoResponseSupportResourcesSupportResource extends TeaModel {
        @NameInMap("DataDiskMinSize")
        @Validation(required = true)
        public Integer dataDiskMinSize;

        @NameInMap("DataDiskMaxSize")
        @Validation(required = true)
        public Integer dataDiskMaxSize;

        @NameInMap("SystemDiskMinSize")
        @Validation(required = true)
        public Integer systemDiskMinSize;

        @NameInMap("SystemDiskMaxSize")
        @Validation(required = true)
        public Integer systemDiskMaxSize;

        @NameInMap("EnsRegionIdsExtends")
        @Validation(required = true)
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends ensRegionIdsExtends;

        @NameInMap("EnsRegionIds")
        @Validation(required = true)
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds ensRegionIds;

        @NameInMap("InstanceSpeces")
        @Validation(required = true)
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces instanceSpeces;

        @NameInMap("BandwidthTypes")
        @Validation(required = true)
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes bandwidthTypes;

        public static DescribeAvailableResourceInfoResponseSupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResourcesSupportResource self = new DescribeAvailableResourceInfoResponseSupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setDataDiskMinSize(Integer dataDiskMinSize) {
            this.dataDiskMinSize = dataDiskMinSize;
            return this;
        }
        public Integer getDataDiskMinSize() {
            return this.dataDiskMinSize;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setDataDiskMaxSize(Integer dataDiskMaxSize) {
            this.dataDiskMaxSize = dataDiskMaxSize;
            return this;
        }
        public Integer getDataDiskMaxSize() {
            return this.dataDiskMaxSize;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setSystemDiskMinSize(Integer systemDiskMinSize) {
            this.systemDiskMinSize = systemDiskMinSize;
            return this;
        }
        public Integer getSystemDiskMinSize() {
            return this.systemDiskMinSize;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setSystemDiskMaxSize(Integer systemDiskMaxSize) {
            this.systemDiskMaxSize = systemDiskMaxSize;
            return this;
        }
        public Integer getSystemDiskMaxSize() {
            return this.systemDiskMaxSize;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setEnsRegionIdsExtends(DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends ensRegionIdsExtends) {
            this.ensRegionIdsExtends = ensRegionIdsExtends;
            return this;
        }
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIdsExtends getEnsRegionIdsExtends() {
            return this.ensRegionIdsExtends;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setEnsRegionIds(DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds ensRegionIds) {
            this.ensRegionIds = ensRegionIds;
            return this;
        }
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceEnsRegionIds getEnsRegionIds() {
            return this.ensRegionIds;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setInstanceSpeces(DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces instanceSpeces) {
            this.instanceSpeces = instanceSpeces;
            return this;
        }
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceInstanceSpeces getInstanceSpeces() {
            return this.instanceSpeces;
        }

        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResource setBandwidthTypes(DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes bandwidthTypes) {
            this.bandwidthTypes = bandwidthTypes;
            return this;
        }
        public DescribeAvailableResourceInfoResponseSupportResourcesSupportResourceBandwidthTypes getBandwidthTypes() {
            return this.bandwidthTypes;
        }

    }

    public static class DescribeAvailableResourceInfoResponseSupportResources extends TeaModel {
        @NameInMap("SupportResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceInfoResponseSupportResourcesSupportResource> supportResource;

        public static DescribeAvailableResourceInfoResponseSupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseSupportResources self = new DescribeAvailableResourceInfoResponseSupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseSupportResources setSupportResource(java.util.List<DescribeAvailableResourceInfoResponseSupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceInfoResponseSupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

    public static class DescribeAvailableResourceInfoResponseImagesImage extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        @NameInMap("ImageSize")
        @Validation(required = true)
        public Integer imageSize;

        public static DescribeAvailableResourceInfoResponseImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseImagesImage self = new DescribeAvailableResourceInfoResponseImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAvailableResourceInfoResponseImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeAvailableResourceInfoResponseImagesImage setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Integer getImageSize() {
            return this.imageSize;
        }

    }

    public static class DescribeAvailableResourceInfoResponseImages extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceInfoResponseImagesImage> image;

        public static DescribeAvailableResourceInfoResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceInfoResponseImages self = new DescribeAvailableResourceInfoResponseImages();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceInfoResponseImages setImage(java.util.List<DescribeAvailableResourceInfoResponseImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeAvailableResourceInfoResponseImagesImage> getImage() {
            return this.image;
        }

    }

}
