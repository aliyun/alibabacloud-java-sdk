// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommunityImagesResponseBody extends TeaModel {
    /**
     * <p>The list of custom images and shared images that are supported by the E-HPC.</p>
     */
    @NameInMap("Images")
    public ListCommunityImagesResponseBodyImages images;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
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
        /**
         * <p>The architecture of the operating system. Valid values:</p>
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
         * <p>The operating system tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The distribution of the operating system. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>Ubuntu</li>
         * <li>SUSE</li>
         * <li>OpenSUSE</li>
         * <li>Debian</li>
         * <li>CoreOS</li>
         * <li>Aliyun</li>
         * <li>Windows Server 2003</li>
         * <li>Windows Server 2008</li>
         * <li>Windows Server 2012</li>
         * <li>Others Linux</li>
         * <li>Customized Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The version of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>7.2</p>
         */
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
        /**
         * <p>The architecture of the operating system. Valid values:</p>
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
         * <p>The tag of the BOS image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The operating system tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The OS.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The version of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>7.2</p>
         */
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
        /**
         * <p>The tag of the BOS image.</p>
         */
        @NameInMap("BaseOsTag")
        public ListCommunityImagesResponseBodyImagesImageInfoBaseOsTag baseOsTag;

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp181x855551ww5yq****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>linux_CentOS7.2_OceanBase_OBD_1ECS-3OB_3.0</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>An array of OS images that are supported by E-HPC.</p>
         */
        @NameInMap("OsTag")
        public ListCommunityImagesResponseBodyImagesImageInfoOsTag osTag;

        /**
         * <p>The script that is run after the image is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>example.sh</p>
         */
        @NameInMap("PostInstallScript")
        public String postInstallScript;

        /**
         * <p>The billing unit of the image. Valid values:</p>
         * <ul>
         * <li>Hour</li>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <p>The product code in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj028279</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The size of the image. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The stock keeping unit (SKU) of the image. Valid values:</p>
         * <ul>
         * <li>ECS: pay-as-you-go</li>
         * <li>package: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("SkuCode")
        public String skuCode;

        /**
         * <p>The state of the image. Valid values:</p>
         * <ul>
         * <li>UnAvailable</li>
         * <li>Available</li>
         * <li>Creating</li>
         * <li>CreateFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The owner of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>127****</p>
         */
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
