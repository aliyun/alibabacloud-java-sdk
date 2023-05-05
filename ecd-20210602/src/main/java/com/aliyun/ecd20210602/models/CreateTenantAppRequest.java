// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateTenantAppRequest extends TeaModel {
    @NameInMap("AppTag")
    public java.util.List<String> appTag;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppVersionName")
    public String appVersionName;

    @NameInMap("ApplicationLink")
    public String applicationLink;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("CateType")
    public Integer cateType;

    @NameInMap("ControlParam")
    public String controlParam;

    @NameInMap("Description")
    public String description;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("Developer")
    public String developer;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("ExecuteFile")
    public String executeFile;

    @NameInMap("ExecuteFileAddress")
    public String executeFileAddress;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileOpenWay")
    public java.util.List<String> fileOpenWay;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("FileRealName")
    public String fileRealName;

    @NameInMap("IconUrl")
    public String iconUrl;

    @NameInMap("IsFree")
    public String isFree;

    @NameInMap("LicenceType")
    public String licenceType;

    @NameInMap("Name")
    public String name;

    @NameInMap("OS")
    public String OS;

    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    @NameInMap("SearchTag")
    public String searchTag;

    @NameInMap("SilenceFlag")
    public Integer silenceFlag;

    @NameInMap("SilenceParam")
    public String silenceParam;

    @NameInMap("Size")
    public Long size;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StartParam")
    public String startParam;

    @NameInMap("SubAppType")
    public String subAppType;

    @NameInMap("WamFileName")
    public String wamFileName;

    @NameInMap("WamFilePath")
    public String wamFilePath;

    @NameInMap("WamFileRealName")
    public String wamFileRealName;

    public static CreateTenantAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantAppRequest self = new CreateTenantAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantAppRequest setAppTag(java.util.List<String> appTag) {
        this.appTag = appTag;
        return this;
    }
    public java.util.List<String> getAppTag() {
        return this.appTag;
    }

    public CreateTenantAppRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateTenantAppRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public CreateTenantAppRequest setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
        return this;
    }
    public String getApplicationLink() {
        return this.applicationLink;
    }

    public CreateTenantAppRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateTenantAppRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateTenantAppRequest setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }
    public Integer getCateId() {
        return this.cateId;
    }

    public CreateTenantAppRequest setCateType(Integer cateType) {
        this.cateType = cateType;
        return this;
    }
    public Integer getCateType() {
        return this.cateType;
    }

    public CreateTenantAppRequest setControlParam(String controlParam) {
        this.controlParam = controlParam;
        return this;
    }
    public String getControlParam() {
        return this.controlParam;
    }

    public CreateTenantAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantAppRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateTenantAppRequest setDeveloper(String developer) {
        this.developer = developer;
        return this;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public CreateTenantAppRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public CreateTenantAppRequest setExecuteFile(String executeFile) {
        this.executeFile = executeFile;
        return this;
    }
    public String getExecuteFile() {
        return this.executeFile;
    }

    public CreateTenantAppRequest setExecuteFileAddress(String executeFileAddress) {
        this.executeFileAddress = executeFileAddress;
        return this;
    }
    public String getExecuteFileAddress() {
        return this.executeFileAddress;
    }

    public CreateTenantAppRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateTenantAppRequest setFileOpenWay(java.util.List<String> fileOpenWay) {
        this.fileOpenWay = fileOpenWay;
        return this;
    }
    public java.util.List<String> getFileOpenWay() {
        return this.fileOpenWay;
    }

    public CreateTenantAppRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateTenantAppRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

    public CreateTenantAppRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public CreateTenantAppRequest setIsFree(String isFree) {
        this.isFree = isFree;
        return this;
    }
    public String getIsFree() {
        return this.isFree;
    }

    public CreateTenantAppRequest setLicenceType(String licenceType) {
        this.licenceType = licenceType;
        return this;
    }
    public String getLicenceType() {
        return this.licenceType;
    }

    public CreateTenantAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTenantAppRequest setOS(String OS) {
        this.OS = OS;
        return this;
    }
    public String getOS() {
        return this.OS;
    }

    public CreateTenantAppRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    public CreateTenantAppRequest setSearchTag(String searchTag) {
        this.searchTag = searchTag;
        return this;
    }
    public String getSearchTag() {
        return this.searchTag;
    }

    public CreateTenantAppRequest setSilenceFlag(Integer silenceFlag) {
        this.silenceFlag = silenceFlag;
        return this;
    }
    public Integer getSilenceFlag() {
        return this.silenceFlag;
    }

    public CreateTenantAppRequest setSilenceParam(String silenceParam) {
        this.silenceParam = silenceParam;
        return this;
    }
    public String getSilenceParam() {
        return this.silenceParam;
    }

    public CreateTenantAppRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CreateTenantAppRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateTenantAppRequest setStartParam(String startParam) {
        this.startParam = startParam;
        return this;
    }
    public String getStartParam() {
        return this.startParam;
    }

    public CreateTenantAppRequest setSubAppType(String subAppType) {
        this.subAppType = subAppType;
        return this;
    }
    public String getSubAppType() {
        return this.subAppType;
    }

    public CreateTenantAppRequest setWamFileName(String wamFileName) {
        this.wamFileName = wamFileName;
        return this;
    }
    public String getWamFileName() {
        return this.wamFileName;
    }

    public CreateTenantAppRequest setWamFilePath(String wamFilePath) {
        this.wamFilePath = wamFilePath;
        return this;
    }
    public String getWamFilePath() {
        return this.wamFilePath;
    }

    public CreateTenantAppRequest setWamFileRealName(String wamFileRealName) {
        this.wamFileRealName = wamFileRealName;
        return this;
    }
    public String getWamFileRealName() {
        return this.wamFileRealName;
    }

}
