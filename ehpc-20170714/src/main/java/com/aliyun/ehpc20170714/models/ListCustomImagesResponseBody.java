// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ListCustomImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public ListCustomImagesResponseBodyImages images;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCustomImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesResponseBody self = new ListCustomImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesResponseBody setImages(ListCustomImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public ListCustomImagesResponseBodyImages getImages() {
        return this.images;
    }

    public ListCustomImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCustomImagesResponseBodyImagesImageInfoBaseOsTag extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Version")
        public String version;

        public static ListCustomImagesResponseBodyImagesImageInfoBaseOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesImageInfoBaseOsTag self = new ListCustomImagesResponseBodyImagesImageInfoBaseOsTag();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListCustomImagesResponseBodyImagesImageInfo extends TeaModel {
        @NameInMap("BaseOsTag")
        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        public static ListCustomImagesResponseBodyImagesImageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesImageInfo self = new ListCustomImagesResponseBodyImagesImageInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesImageInfo setBaseOsTag(ListCustomImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

    }

    public static class ListCustomImagesResponseBodyImages extends TeaModel {
        @NameInMap("ImageInfo")
        public java.util.List<ListCustomImagesResponseBodyImagesImageInfo> imageInfo;

        public static ListCustomImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImages self = new ListCustomImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImages setImageInfo(java.util.List<ListCustomImagesResponseBodyImagesImageInfo> imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }
        public java.util.List<ListCustomImagesResponseBodyImagesImageInfo> getImageInfo() {
            return this.imageInfo;
        }

    }

}
