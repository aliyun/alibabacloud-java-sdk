// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommunityImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public ListCommunityImagesResponseBodyImages images;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCommunityImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommunityImagesResponseBody self = new ListCommunityImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommunityImagesResponseBody setImages(ListCommunityImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public ListCommunityImagesResponseBodyImages getImages() {
        return this.images;
    }

    public ListCommunityImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Version")
        public String version;

        public static ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag self = new ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag();
            return TeaModel.build(map, self);
        }

        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListCommunityImagesResponseBodyImagesImageInfoOsTag extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Version")
        public String version;

        public static ListCommunityImagesResponseBodyImagesImageInfoOsTag build(java.util.Map<String, ?> map) throws Exception {
            ListCommunityImagesResponseBodyImagesImageInfoOsTag self = new ListCommunityImagesResponseBodyImagesImageInfoOsTag();
            return TeaModel.build(map, self);
        }

        public ListCommunityImagesResponseBodyImagesImageInfoOsTag setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoOsTag setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoOsTag setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoOsTag setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListCommunityImagesResponseBodyImagesImageInfoOsTag setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListCommunityImagesResponseBodyImagesImageInfo extends TeaModel {
        @NameInMap("BaseOsTag")
        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("OsTag")
        public ListCommunityImagesResponseBodyImagesImageInfoOsTag osTag;

        @NameInMap("PostInstallScript")
        public String postInstallScript;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SkuCode")
        public String skuCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        public static ListCommunityImagesResponseBodyImagesImageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCommunityImagesResponseBodyImagesImageInfo self = new ListCommunityImagesResponseBodyImagesImageInfo();
            return TeaModel.build(map, self);
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setBaseOsTag(ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setOsTag(ListCommunityImagesResponseBodyImagesImageInfoOsTag osTag) {
            this.osTag = osTag;
            return this;
        }
        public ListCommunityImagesResponseBodyImagesImageInfoOsTag getOsTag() {
            return this.osTag;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setPostInstallScript(String postInstallScript) {
            this.postInstallScript = postInstallScript;
            return this;
        }
        public String getPostInstallScript() {
            return this.postInstallScript;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public String getSkuCode() {
            return this.skuCode;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCommunityImagesResponseBodyImagesImageInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListCommunityImagesResponseBodyImages extends TeaModel {
        @NameInMap("ImageInfo")
        public java.util.List<ListCommunityImagesResponseBodyImagesImageInfo> imageInfo;

        public static ListCommunityImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListCommunityImagesResponseBodyImages self = new ListCommunityImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListCommunityImagesResponseBodyImages setImageInfo(java.util.List<ListCommunityImagesResponseBodyImagesImageInfo> imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }
        public java.util.List<ListCommunityImagesResponseBodyImagesImageInfo> getImageInfo() {
            return this.imageInfo;
        }

    }

}
