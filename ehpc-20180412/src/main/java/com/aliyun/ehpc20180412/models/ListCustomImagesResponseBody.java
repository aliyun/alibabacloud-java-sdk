// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCustomImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Images")
    public java.util.List<ListCustomImagesResponseBodyImages> images;

    public static ListCustomImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesResponseBody self = new ListCustomImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomImagesResponseBody setImages(java.util.List<ListCustomImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListCustomImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public static class ListCustomImagesResponseBodyImagesOsTag extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Architecture")
        public String architecture;

        public static ListCustomImagesResponseBodyImagesOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesOsTag self = new ListCustomImagesResponseBodyImagesOsTag();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListCustomImagesResponseBodyImagesOsTag setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListCustomImagesResponseBodyImagesOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCustomImagesResponseBodyImagesOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCustomImagesResponseBodyImagesOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

    public static class ListCustomImagesResponseBodyImagesBaseOsTag extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Architecture")
        public String architecture;

        public static ListCustomImagesResponseBodyImagesBaseOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesBaseOsTag self = new ListCustomImagesResponseBodyImagesBaseOsTag();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesBaseOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListCustomImagesResponseBodyImagesBaseOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCustomImagesResponseBodyImagesBaseOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCustomImagesResponseBodyImagesBaseOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

    public static class ListCustomImagesResponseBodyImages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PostInstallScript")
        public String postInstallScript;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("OsTag")
        public ListCustomImagesResponseBodyImagesOsTag osTag;

        @NameInMap("SkuCode")
        public String skuCode;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("BaseOsTag")
        public ListCustomImagesResponseBodyImagesBaseOsTag baseOsTag;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListCustomImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImages self = new ListCustomImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomImagesResponseBodyImages setPostInstallScript(String postInstallScript) {
            this.postInstallScript = postInstallScript;
            return this;
        }
        public String getPostInstallScript() {
            return this.postInstallScript;
        }

        public ListCustomImagesResponseBodyImages setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListCustomImagesResponseBodyImages setOsTag(ListCustomImagesResponseBodyImagesOsTag osTag) {
            this.osTag = osTag;
            return this;
        }
        public ListCustomImagesResponseBodyImagesOsTag getOsTag() {
            return this.osTag;
        }

        public ListCustomImagesResponseBodyImages setSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public String getSkuCode() {
            return this.skuCode;
        }

        public ListCustomImagesResponseBodyImages setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public ListCustomImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomImagesResponseBodyImages setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListCustomImagesResponseBodyImages setBaseOsTag(ListCustomImagesResponseBodyImagesBaseOsTag baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public ListCustomImagesResponseBodyImagesBaseOsTag getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListCustomImagesResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListCustomImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListCustomImagesResponseBodyImages setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListCustomImagesResponseBodyImages setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
