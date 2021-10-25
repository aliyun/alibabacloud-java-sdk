// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCustomImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Images")
    public ListCustomImagesResponseBodyImages images;

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

    public ListCustomImagesResponseBody setImages(ListCustomImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public ListCustomImagesResponseBodyImages getImages() {
        return this.images;
    }

    public static class ListCustomImagesResponseBodyImagesImageInfoBaseOsTag extends TeaModel {
        @NameInMap("Platform")
        public String platform;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Version")
        public String version;

        @NameInMap("Architecture")
        public String architecture;

        public static ListCustomImagesResponseBodyImagesImageInfoBaseOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesImageInfoBaseOsTag self = new ListCustomImagesResponseBodyImagesImageInfoBaseOsTag();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

    public static class ListCustomImagesResponseBodyImagesImageInfoOsTag extends TeaModel {
        @NameInMap("Platform")
        public String platform;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Version")
        public String version;

        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        public static ListCustomImagesResponseBodyImagesImageInfoOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesImageInfoOsTag self = new ListCustomImagesResponseBodyImagesImageInfoOsTag();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesImageInfoOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCustomImagesResponseBodyImagesImageInfoOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCustomImagesResponseBodyImagesImageInfoOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListCustomImagesResponseBodyImagesImageInfoOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListCustomImagesResponseBodyImagesImageInfoOsTag setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

    }

    public static class ListCustomImagesResponseBodyImagesImageInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PostInstallScript")
        public String postInstallScript;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("SkuCode")
        public String skuCode;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("BaseOsTag")
        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag;

        @NameInMap("OsTag")
        public ListCustomImagesResponseBodyImagesImageInfoOsTag osTag;

        public static ListCustomImagesResponseBodyImagesImageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyImagesImageInfo self = new ListCustomImagesResponseBodyImagesImageInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyImagesImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setPostInstallScript(String postInstallScript) {
            this.postInstallScript = postInstallScript;
            return this;
        }
        public String getPostInstallScript() {
            return this.postInstallScript;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public String getSkuCode() {
            return this.skuCode;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setBaseOsTag(ListCustomImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public ListCustomImagesResponseBodyImagesImageInfoBaseOsTag getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListCustomImagesResponseBodyImagesImageInfo setOsTag(ListCustomImagesResponseBodyImagesImageInfoOsTag osTag) {
            this.osTag = osTag;
            return this;
        }
        public ListCustomImagesResponseBodyImagesImageInfoOsTag getOsTag() {
            return this.osTag;
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
