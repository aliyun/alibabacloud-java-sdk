// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListImageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

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
     * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageResponseBody self = new ListImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListImageResponseBody setData(java.util.List<ListImageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImageResponseBodyData> getData() {
        return this.data;
    }

    public ListImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImageResponseBodyDataAppList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ca-xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        public static ListImageResponseBodyDataAppList build(java.util.Map<String, ?> map) throws Exception {
            ListImageResponseBodyDataAppList self = new ListImageResponseBodyDataAppList();
            return TeaModel.build(map, self);
        }

        public ListImageResponseBodyDataAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListImageResponseBodyDataAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListImageResponseBodyDataImageRegionDistributeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>imgc-xxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>70%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static ListImageResponseBodyDataImageRegionDistributeList build(java.util.Map<String, ?> map) throws Exception {
            ListImageResponseBodyDataImageRegionDistributeList self = new ListImageResponseBodyDataImageRegionDistributeList();
            return TeaModel.build(map, self);
        }

        public ListImageResponseBodyDataImageRegionDistributeList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImageResponseBodyDataImageRegionDistributeList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListImageResponseBodyDataImageRegionDistributeList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListImageResponseBodyDataImageRegionDistributeList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImageResponseBodyDataImageRegionDistributeList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class ListImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AppList")
        public java.util.List<ListImageResponseBodyDataAppList> appList;

        /**
         * <strong>example:</strong>
         * <p>imgc-xxx</p>
         */
        @NameInMap("BaseImageId")
        public String baseImageId;

        /**
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("BaseImageVersion")
        public String baseImageVersion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompatibleMode")
        public Boolean compatibleMode;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("Description")
        public String description;

        @NameInMap("Distro")
        public String distro;

        @NameInMap("DriverList")
        public java.util.List<String> driverList;

        @NameInMap("FeatureList")
        public java.util.List<String> featureList;

        @NameInMap("FotaChannel")
        public String fotaChannel;

        /**
         * <strong>example:</strong>
         * <p>2.3.0-xxx</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>BUILDER_MANUAL</p>
         */
        @NameInMap("ImageCreateMode")
        public String imageCreateMode;

        /**
         * <strong>example:</strong>
         * <p>imgc-xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>DemoImage</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageRegionDistributeList")
        public java.util.List<ListImageResponseBodyDataImageRegionDistributeList> imageRegionDistributeList;

        @NameInMap("ImageRegionList")
        public java.util.List<String> imageRegionList;

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
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("LatestVersionId")
        public String latestVersionId;

        @NameInMap("OnlineVersion")
        public Boolean onlineVersion;

        /**
         * <strong>example:</strong>
         * <p>iv-xxxx</p>
         */
        @NameInMap("OnlineVersionId")
        public String onlineVersionId;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <strong>example:</strong>
         * <p>imgc-xxx</p>
         */
        @NameInMap("ParentImageId")
        public String parentImageId;

        /**
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("ParentImageVersion")
        public String parentImageVersion;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("Platform")
        public Integer platform;

        /**
         * <strong>example:</strong>
         * <p>Windows Server 2022</p>
         */
        @NameInMap("PlatformName")
        public String platformName;

        /**
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <strong>example:</strong>
         * <p>[&quot;eds.cpu.category&quot;]</p>
         */
        @NameInMap("ResourceInstanceCategory")
        public String resourceInstanceCategory;

        /**
         * <strong>example:</strong>
         * <p>SINGLE_SESSION</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SupportedLanguageList")
        public java.util.List<String> supportedLanguageList;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        /**
         * <strong>example:</strong>
         * <p>v0.1.0</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <strong>example:</strong>
         * <p>a7b3c0c8-xxxx</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static ListImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageResponseBodyData self = new ListImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListImageResponseBodyData setAppList(java.util.List<ListImageResponseBodyDataAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<ListImageResponseBodyDataAppList> getAppList() {
            return this.appList;
        }

        public ListImageResponseBodyData setBaseImageId(String baseImageId) {
            this.baseImageId = baseImageId;
            return this;
        }
        public String getBaseImageId() {
            return this.baseImageId;
        }

        public ListImageResponseBodyData setBaseImageVersion(String baseImageVersion) {
            this.baseImageVersion = baseImageVersion;
            return this;
        }
        public String getBaseImageVersion() {
            return this.baseImageVersion;
        }

        public ListImageResponseBodyData setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public ListImageResponseBodyData setCompatibleMode(Boolean compatibleMode) {
            this.compatibleMode = compatibleMode;
            return this;
        }
        public Boolean getCompatibleMode() {
            return this.compatibleMode;
        }

        public ListImageResponseBodyData setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public ListImageResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImageResponseBodyData setDistro(String distro) {
            this.distro = distro;
            return this;
        }
        public String getDistro() {
            return this.distro;
        }

        public ListImageResponseBodyData setDriverList(java.util.List<String> driverList) {
            this.driverList = driverList;
            return this;
        }
        public java.util.List<String> getDriverList() {
            return this.driverList;
        }

        public ListImageResponseBodyData setFeatureList(java.util.List<String> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        public ListImageResponseBodyData setFotaChannel(String fotaChannel) {
            this.fotaChannel = fotaChannel;
            return this;
        }
        public String getFotaChannel() {
            return this.fotaChannel;
        }

        public ListImageResponseBodyData setFotaVersion(String fotaVersion) {
            this.fotaVersion = fotaVersion;
            return this;
        }
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        public ListImageResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListImageResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListImageResponseBodyData setImageCreateMode(String imageCreateMode) {
            this.imageCreateMode = imageCreateMode;
            return this;
        }
        public String getImageCreateMode() {
            return this.imageCreateMode;
        }

        public ListImageResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImageResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListImageResponseBodyData setImageRegionDistributeList(java.util.List<ListImageResponseBodyDataImageRegionDistributeList> imageRegionDistributeList) {
            this.imageRegionDistributeList = imageRegionDistributeList;
            return this;
        }
        public java.util.List<ListImageResponseBodyDataImageRegionDistributeList> getImageRegionDistributeList() {
            return this.imageRegionDistributeList;
        }

        public ListImageResponseBodyData setImageRegionList(java.util.List<String> imageRegionList) {
            this.imageRegionList = imageRegionList;
            return this;
        }
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        public ListImageResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ListImageResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListImageResponseBodyData setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public ListImageResponseBodyData setOnlineVersion(Boolean onlineVersion) {
            this.onlineVersion = onlineVersion;
            return this;
        }
        public Boolean getOnlineVersion() {
            return this.onlineVersion;
        }

        public ListImageResponseBodyData setOnlineVersionId(String onlineVersionId) {
            this.onlineVersionId = onlineVersionId;
            return this;
        }
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        public ListImageResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListImageResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListImageResponseBodyData setParentImageId(String parentImageId) {
            this.parentImageId = parentImageId;
            return this;
        }
        public String getParentImageId() {
            return this.parentImageId;
        }

        public ListImageResponseBodyData setParentImageVersion(String parentImageVersion) {
            this.parentImageVersion = parentImageVersion;
            return this;
        }
        public String getParentImageVersion() {
            return this.parentImageVersion;
        }

        public ListImageResponseBodyData setPlatform(Integer platform) {
            this.platform = platform;
            return this;
        }
        public Integer getPlatform() {
            return this.platform;
        }

        public ListImageResponseBodyData setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public ListImageResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListImageResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListImageResponseBodyData setResourceInstanceCategory(String resourceInstanceCategory) {
            this.resourceInstanceCategory = resourceInstanceCategory;
            return this;
        }
        public String getResourceInstanceCategory() {
            return this.resourceInstanceCategory;
        }

        public ListImageResponseBodyData setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public ListImageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImageResponseBodyData setSupportedLanguageList(java.util.List<String> supportedLanguageList) {
            this.supportedLanguageList = supportedLanguageList;
            return this;
        }
        public java.util.List<String> getSupportedLanguageList() {
            return this.supportedLanguageList;
        }

        public ListImageResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ListImageResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListImageResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListImageResponseBodyData setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public ListImageResponseBodyData setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
