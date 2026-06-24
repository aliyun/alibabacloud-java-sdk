// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageRequest extends TeaModel {
    /**
     * <p>The list of supported regions.
     * WUYING images are centralized. Use this parameter to query the regions where the image is deployed.</p>
     */
    @NameInMap("BizRegionIdList")
    public java.util.List<String> bizRegionIdList;

    /**
     * <p>The business type. This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The list of all business types. This parameter is not publicly available.</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<Integer> bizTypeList;

    @NameInMap("Distro")
    public String distro;

    /**
     * <p>The list of features supported by the image.</p>
     */
    @NameInMap("FeatureList")
    public java.util.List<String> featureList;

    /**
     * <p>The image version information.</p>
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
     * <p>The image type.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LanguageType")
    public String languageType;

    /**
     * <p>The operating system type of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The image package type.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging queries. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The operating system platform name.</p>
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
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of products supported when the image supports multiple products.</p>
     */
    @NameInMap("ProductTypeList")
    public java.util.List<String> productTypeList;

    /**
     * <p>The protocol type of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>Queries images of specific defined specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.2c4g</p>
     */
    @NameInMap("ResourceInstanceType")
    public String resourceInstanceType;

    /**
     * <p>The image status. Specifies the status of images to query. By default, all images that are not deleted are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags for query.</p>
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

    public ListImageRequest setDistro(String distro) {
        this.distro = distro;
        return this;
    }
    public String getDistro() {
        return this.distro;
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
         * <p>The custom tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The custom tag value.</p>
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
