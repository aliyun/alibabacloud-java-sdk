// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateTenantAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AppTag")
    public java.util.List<String> appTag;

    @NameInMap("AppTag1")
    public String appTag1;

    @NameInMap("AppVersion")
    public String appVersion;

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

    @NameInMap("FileName")
    public String fileName;

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

    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    @NameInMap("SearchTag")
    public String searchTag;

    @NameInMap("SilenceFlag")
    public Integer silenceFlag;

    @NameInMap("SilenceParam")
    public String silenceParam;

    @NameInMap("WamFileName")
    public String wamFileName;

    @NameInMap("WamFilePath")
    public String wamFilePath;

    @NameInMap("WamFileRealName")
    public String wamFileRealName;

    public static UpdateTenantAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantAppRequest self = new UpdateTenantAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public UpdateTenantAppRequest setAppTag(java.util.List<String> appTag) {
        this.appTag = appTag;
        return this;
    }
    public java.util.List<String> getAppTag() {
        return this.appTag;
    }

    public UpdateTenantAppRequest setAppTag1(String appTag1) {
        this.appTag1 = appTag1;
        return this;
    }
    public String getAppTag1() {
        return this.appTag1;
    }

    public UpdateTenantAppRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateTenantAppRequest setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
        return this;
    }
    public String getApplicationLink() {
        return this.applicationLink;
    }

    public UpdateTenantAppRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpdateTenantAppRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateTenantAppRequest setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }
    public Integer getCateId() {
        return this.cateId;
    }

    public UpdateTenantAppRequest setCateType(Integer cateType) {
        this.cateType = cateType;
        return this;
    }
    public Integer getCateType() {
        return this.cateType;
    }

    public UpdateTenantAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTenantAppRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateTenantAppRequest setDeveloper(String developer) {
        this.developer = developer;
        return this;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public UpdateTenantAppRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public UpdateTenantAppRequest setExecuteFile(String executeFile) {
        this.executeFile = executeFile;
        return this;
    }
    public String getExecuteFile() {
        return this.executeFile;
    }

    public UpdateTenantAppRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateTenantAppRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateTenantAppRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

    public UpdateTenantAppRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public UpdateTenantAppRequest setIsFree(String isFree) {
        this.isFree = isFree;
        return this;
    }
    public String getIsFree() {
        return this.isFree;
    }

    public UpdateTenantAppRequest setLicenceType(String licenceType) {
        this.licenceType = licenceType;
        return this;
    }
    public String getLicenceType() {
        return this.licenceType;
    }

    public UpdateTenantAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTenantAppRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    public UpdateTenantAppRequest setSearchTag(String searchTag) {
        this.searchTag = searchTag;
        return this;
    }
    public String getSearchTag() {
        return this.searchTag;
    }

    public UpdateTenantAppRequest setSilenceFlag(Integer silenceFlag) {
        this.silenceFlag = silenceFlag;
        return this;
    }
    public Integer getSilenceFlag() {
        return this.silenceFlag;
    }

    public UpdateTenantAppRequest setSilenceParam(String silenceParam) {
        this.silenceParam = silenceParam;
        return this;
    }
    public String getSilenceParam() {
        return this.silenceParam;
    }

    public UpdateTenantAppRequest setWamFileName(String wamFileName) {
        this.wamFileName = wamFileName;
        return this;
    }
    public String getWamFileName() {
        return this.wamFileName;
    }

    public UpdateTenantAppRequest setWamFilePath(String wamFilePath) {
        this.wamFilePath = wamFilePath;
        return this;
    }
    public String getWamFilePath() {
        return this.wamFilePath;
    }

    public UpdateTenantAppRequest setWamFileRealName(String wamFileRealName) {
        this.wamFileRealName = wamFileRealName;
        return this;
    }
    public String getWamFileRealName() {
        return this.wamFileRealName;
    }

}
