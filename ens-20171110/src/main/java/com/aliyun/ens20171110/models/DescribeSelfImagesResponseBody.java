// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSelfImagesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The image information.</p>
     */
    @NameInMap("Images")
    public DescribeSelfImagesResponseBodyImages images;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8B8EB73-B4FD-4262-8EF6-680DF39C9BA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSelfImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSelfImagesResponseBody self = new DescribeSelfImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSelfImagesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSelfImagesResponseBody setImages(DescribeSelfImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeSelfImagesResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeSelfImagesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSelfImagesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSelfImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSelfImagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        /**
         * <p>The format of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>The format of the image.
         * raw
         * qcow2</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>system: system disk.</li>
         * <li>data: data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Data</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of image.</p>
         * 
         * <strong>example:</strong>
         * <p>i-test</p>
         */
        @NameInMap("imageId")
        public String imageId;

        public static DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

    public static class DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings self = new DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeSelfImagesResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The image architecture. Valid values:</p>
         * <ul>
         * <li>i386</li>
         * <li>x86_64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>Computing type. ens_vm/ens: x86 computing. bare_metal: x86 bare machine or x86 bare metal. arm_vm: ARM computing. arm_bare_metal: ARM bare machine or ARM bare metal. pcfarm: heterogeneous computing.</p>
         * 
         * <strong>example:</strong>
         * <p>ens_vm</p>
         */
        @NameInMap("ComputeType")
        public String computeType;

        /**
         * <p>The image creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-08T12:10:03Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The mappings between the disk and the snapshot in the image.</p>
         */
        @NameInMap("DiskDeviceMappings")
        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

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
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li><strong>others</strong>: a custom image that is shared by other Alibaba Cloud accounts.</li>
         * <li><strong>self</strong>: your own custom image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ImageSize")
        public String imageSize;

        /**
         * <p>The size of the image storage.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("ImageStorageSize")
        public String imageStorageSize;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5iqczfxps7csjrxeca****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operating system version.</p>
         * 
         * <strong>example:</strong>
         * <p>7.2</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <p>The platform.</p>
         * <ul>
         * <li>centos</li>
         * <li>ubuntu</li>
         * <li>alios</li>
         * <li>debian</li>
         * <li>rhel</li>
         * <li>windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>centos</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-5yt3bdedxzdz6t6uuw****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The state of the image.</p>
         * <ul>
         * <li>Creating.</li>
         * <li>Packing.</li>
         * <li>Uploading.</li>
         * <li>Pack_failed.</li>
         * <li>Upload_failed.</li>
         * <li>Available: Only images in the Available state can be used and operated.</li>
         * <li>Unavailable.</li>
         * <li>Copying.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSelfImagesResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSelfImagesResponseBodyImagesImage self = new DescribeSelfImagesResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeSelfImagesResponseBodyImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeSelfImagesResponseBodyImagesImage setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public DescribeSelfImagesResponseBodyImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSelfImagesResponseBodyImagesImage setDiskDeviceMappings(DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeSelfImagesResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeSelfImagesResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeSelfImagesResponseBodyImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeSelfImagesResponseBodyImagesImage setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
        }

        public DescribeSelfImagesResponseBodyImagesImage setImageStorageSize(String imageStorageSize) {
            this.imageStorageSize = imageStorageSize;
            return this;
        }
        public String getImageStorageSize() {
            return this.imageStorageSize;
        }

        public DescribeSelfImagesResponseBodyImagesImage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSelfImagesResponseBodyImagesImage setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeSelfImagesResponseBodyImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeSelfImagesResponseBodyImagesImage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSelfImagesResponseBodyImagesImage setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSelfImagesResponseBodyImagesImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSelfImagesResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeSelfImagesResponseBodyImagesImage> image;

        public static DescribeSelfImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeSelfImagesResponseBodyImages self = new DescribeSelfImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeSelfImagesResponseBodyImages setImage(java.util.List<DescribeSelfImagesResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeSelfImagesResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
