// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageRequest extends TeaModel {
    @NameInMap("BizRegionIdList")
    public java.util.List<String> bizRegionIdList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("BizTypeList")
    public java.util.List<Integer> bizTypeList;

    @NameInMap("FeatureList")
    public java.util.List<String> featureList;

    /**
     * <strong>example:</strong>
     * <p>2.0.3-xxxx</p>
     */
    @NameInMap("FotaVersion")
    public String fotaVersion;

    /**
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>DemoImage</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LanguageType")
    public String languageType;

    /**
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Windows Server 2019</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    @NameInMap("PlatformNameList")
    public java.util.List<String> platformNameList;

    /**
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ProductTypeList")
    public java.util.List<String> productTypeList;

    /**
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <strong>example:</strong>
     * <p>eds.enterprise_office.2c4g</p>
     */
    @NameInMap("ResourceInstanceType")
    public String resourceInstanceType;

    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("Status")
    public String status;

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
        @NameInMap("Key")
        public String key;

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
