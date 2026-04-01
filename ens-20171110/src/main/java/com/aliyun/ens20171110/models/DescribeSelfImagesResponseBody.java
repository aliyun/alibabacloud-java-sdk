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
        @NameInMap("Format")
        public String format;

        @NameInMap("Size")
        public String size;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("ComputeType")
        public String computeType;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DiskDeviceMappings")
        public DescribeSelfImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("ImageSize")
        public String imageSize;

        @NameInMap("ImageStorageSize")
        public String imageStorageSize;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SnapshotId")
        public String snapshotId;

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
