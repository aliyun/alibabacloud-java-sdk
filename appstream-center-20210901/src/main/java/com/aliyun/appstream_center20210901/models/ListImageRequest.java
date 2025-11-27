// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageRequest extends TeaModel {
    /**
     * <p>The regions that are supported. The EDS images are centralized. Use this parameter to query the regions where the image is deployed.</p>
     */
    @NameInMap("BizRegionIdList")
    public java.util.List<String> bizRegionIdList;

    /**
     * <p>The service type. This parameter is not available publicly.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>1 (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The list of all service types. It is not available publicly.</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<Integer> bizTypeList;

    /**
     * <p>The features supported by the image.</p>
     */
    @NameInMap("FeatureList")
    public java.util.List<String> featureList;

    /**
     * <p>The image version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.3-xxxx</p>
     */
    @NameInMap("FotaVersion")
    public String fotaVersion;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoImage</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The type of the images.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>User: a custom image.</li>
     * <li>Shared: a shared image.</li>
     * <li>System: a system image.</li>
     * <li>Community: a community image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The language.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>en-US: English.</li>
     * <li>zh-HK: Chinese, Traditional (Hong Kong, China).</li>
     * <li>zh-CN: Simplified Chinese.</li>
     * <li>ja-JP: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LanguageType")
    public String languageType;

    /**
     * <p>The OS type of the image.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Linux</li>
     * <li>Unknown</li>
     * <li>Windows</li>
     * <li>Android</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The image encapsulation type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Ecs_Container: ECS and Docker image</li>
     * <li>Ecs: ECS image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the operating system platform.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Ubuntu</li>
     * <li>Debian</li>
     * <li>Windows Server 2022</li>
     * <li>Windows Server 2019</li>
     * <li>Windows Server 2016</li>
     * <li>Windows 11</li>
     * <li>Windows 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows Server 2019</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    /**
     * <p>The list of supported platform types. For valid values, refer to PlatformName above.</p>
     */
    @NameInMap("PlatformNameList")
    public java.util.List<String> platformNameList;

    /**
     * <p>The product type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudDesktop: Elastic Desktop Service</li>
     * <li>CloudApp: App Streaming</li>
     * <li>WuyingServer: Workstation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of products that are supported when the image supports multiple products.</p>
     */
    @NameInMap("ProductTypeList")
    public java.util.List<String> productTypeList;

    /**
     * <p>The protocol type of the image.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HDX: the High-definition Experience (HDX) protocol</li>
     * <li>ASP: the Alibaba Cloud-developed ASP protocol</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>Find images with certain fixed specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.2c4g</p>
     */
    @NameInMap("ResourceInstanceType")
    public String resourceInstanceType;

    /**
     * <p>The status of the image. You can query images in the specified status. By default, all images in the Not Deleted state are queried.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AVAILABLE: The image is available.</li>
     * <li>INIT: The image is being initialized.</li>
     * <li>CREATE_FAILED: The image failed to be created.</li>
     * <li>CREATING: The image is being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags to query.</p>
     */
    @NameInMap("TagList")
    public java.util.List<ListImageRequestTagList> tagList;

    public static ListImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageRequest self = new ListImageRequest();
        return TeaModel.build(map, self);
    }

    public ListImageRequest setBizRegionIdList(java.util.List<String> bizRegionIdList) {
        this.bizRegionIdList = bizRegionIdList;
        return this;
    }
    public java.util.List<String> getBizRegionIdList() {
        return this.bizRegionIdList;
    }

    public ListImageRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListImageRequest setBizTypeList(java.util.List<Integer> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<Integer> getBizTypeList() {
        return this.bizTypeList;
    }

    public ListImageRequest setFeatureList(java.util.List<String> featureList) {
        this.featureList = featureList;
        return this;
    }
    public java.util.List<String> getFeatureList() {
        return this.featureList;
    }

    public ListImageRequest setFotaVersion(String fotaVersion) {
        this.fotaVersion = fotaVersion;
        return this;
    }
    public String getFotaVersion() {
        return this.fotaVersion;
    }

    public ListImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ListImageRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }
    public String getLanguageType() {
        return this.languageType;
    }

    public ListImageRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListImageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public ListImageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImageRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public ListImageRequest setPlatformNameList(java.util.List<String> platformNameList) {
        this.platformNameList = platformNameList;
        return this;
    }
    public java.util.List<String> getPlatformNameList() {
        return this.platformNameList;
    }

    public ListImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListImageRequest setProductTypeList(java.util.List<String> productTypeList) {
        this.productTypeList = productTypeList;
        return this;
    }
    public java.util.List<String> getProductTypeList() {
        return this.productTypeList;
    }

    public ListImageRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public ListImageRequest setResourceInstanceType(String resourceInstanceType) {
        this.resourceInstanceType = resourceInstanceType;
        return this;
    }
    public String getResourceInstanceType() {
        return this.resourceInstanceType;
    }

    public ListImageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListImageRequest setTagList(java.util.List<ListImageRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<ListImageRequestTagList> getTagList() {
        return this.tagList;
    }

    public static class ListImageRequestTagList extends TeaModel {
        /**
         * <p>The key of the custom tag.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListImageRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            ListImageRequestTagList self = new ListImageRequestTagList();
            return TeaModel.build(map, self);
        }

        public ListImageRequestTagList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListImageRequestTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
