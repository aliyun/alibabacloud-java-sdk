// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDRAppliancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Images")
    public DescribeDRAppliancesResponseBodyImages images;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDRAppliancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRAppliancesResponseBody self = new DescribeDRAppliancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDRAppliancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDRAppliancesResponseBody setImages(DescribeDRAppliancesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeDRAppliancesResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeDRAppliancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDRAppliancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDRAppliancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDRAppliancesResponseBodyImagesImage extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("ModifiedDate")
        public String modifiedDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static DescribeDRAppliancesResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeDRAppliancesResponseBodyImagesImage self = new DescribeDRAppliancesResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeDRAppliancesResponseBodyImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDRAppliancesResponseBodyImagesImage setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDRAppliancesResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeDRAppliancesResponseBodyImagesImage> image;

        public static DescribeDRAppliancesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDRAppliancesResponseBodyImages self = new DescribeDRAppliancesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeDRAppliancesResponseBodyImages setImage(java.util.List<DescribeDRAppliancesResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeDRAppliancesResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
