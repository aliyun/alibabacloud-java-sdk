// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSelfImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Images")
    public DescribeSelfImagesResponseBodyImages images;

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
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("ImageSize")
        public String imageSize;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("Platform")
        public String platform;

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
