// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSelfImagesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The image information.</p>
     */
    @NameInMap("Images")
    public DescribeSelfImagesResponseBodyImages images;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeSelfImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSelfImagesResponseBodyImagesImage extends TeaModel {
        /**
         * <p>The image architecture. Valid values:</p>
         * <br>
         * <p>*   i386</p>
         * <p>*   x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>Computing type. ens_vm/ens: x86 computing. bare_metal: x86 bare machine or x86 bare metal. arm_vm: ARM computing. arm_bare_metal: ARM bare machine or ARM bare metal. pcfarm: heterogeneous computing.</p>
         */
        @NameInMap("ComputeType")
        public String computeType;

        /**
         * <p>The image creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The source of the image. Valid values:</p>
         * <br>
         * <p>*   **system**: public images</p>
         * <p>*   **self**: your custom images</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         */
        @NameInMap("ImageSize")
        public String imageSize;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operating system version.</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <p>The platform.</p>
         * <br>
         * <p>*   centos</p>
         * <p>*   ubuntu</p>
         * <p>*   alios</p>
         * <p>*   debian</p>
         * <p>*   rhel</p>
         * <p>*   windows</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The state of the image.</p>
         * <br>
         * <p>*   Creating.</p>
         * <p>*   Packing.</p>
         * <p>*   Uploading.</p>
         * <p>*   Pack_failed.</p>
         * <p>*   Upload_failed.</p>
         * <p>*   Available: Only images in the Available state can be used and operated.</p>
         * <p>*   Unavailable.</p>
         * <p>*   Copying.</p>
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
