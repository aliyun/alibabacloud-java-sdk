// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImagesResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Images")
    public DescribeImagesResponseBodyImages images;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8331AA01-C16D-5481-BB47-D19CEBAA811E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of images.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesResponseBody self = new DescribeImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImagesResponseBody setImages(DescribeImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeImagesResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeImagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Size")
        public String size;

        @NameInMap("Type")
        public String type;

        @NameInMap("imageId")
        public String imageId;

        public static DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping self = new DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

    public static class DescribeImagesResponseBodyImagesImageDiskDeviceMappings extends TeaModel {
        @NameInMap("DiskDeviceMapping")
        public java.util.List<DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping;

        public static DescribeImagesResponseBodyImagesImageDiskDeviceMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImageDiskDeviceMappings self = new DescribeImagesResponseBodyImagesImageDiskDeviceMappings();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings setDiskDeviceMapping(java.util.List<DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> diskDeviceMapping) {
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesImageDiskDeviceMappingsDiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

    }

    public static class DescribeImagesResponseBodyImagesImage extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DiskDeviceMappings")
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("ImageSize")
        public String imageSize;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeImagesResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImagesImage self = new DescribeImagesResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImagesImage setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeImagesResponseBodyImagesImage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagesResponseBodyImagesImage setDiskDeviceMappings(DescribeImagesResponseBodyImagesImageDiskDeviceMappings diskDeviceMappings) {
            this.diskDeviceMappings = diskDeviceMappings;
            return this;
        }
        public DescribeImagesResponseBodyImagesImageDiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        public DescribeImagesResponseBodyImagesImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImagesResponseBodyImagesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagesResponseBodyImagesImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeImagesResponseBodyImagesImage setImageSize(String imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public String getImageSize() {
            return this.imageSize;
        }

        public DescribeImagesResponseBodyImagesImage setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeImagesResponseBodyImagesImage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImagesResponseBodyImagesImage setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DescribeImagesResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeImagesResponseBodyImagesImage> image;

        public static DescribeImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesResponseBodyImages self = new DescribeImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeImagesResponseBodyImages setImage(java.util.List<DescribeImagesResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeImagesResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
