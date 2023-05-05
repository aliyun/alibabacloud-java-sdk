// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateAppMetaRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppRegInfo")
    public String appRegInfo;

    @NameInMap("AppTag")
    public java.util.List<String> appTag;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ApplicationLink")
    public String applicationLink;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CateId")
    public Long cateId;

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

    @NameInMap("PublishType")
    public Integer publishType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SilenceFlag")
    public Long silenceFlag;

    @NameInMap("SilenceParam")
    public String silenceParam;

    @NameInMap("WamFileName")
    public String wamFileName;

    @NameInMap("WamFilePath")
    public String wamFilePath;

    @NameInMap("WamFileRealName")
    public String wamFileRealName;

    public static UpdateAppMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppMetaRequest self = new UpdateAppMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppMetaRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateAppMetaRequest setAppRegInfo(String appRegInfo) {
        this.appRegInfo = appRegInfo;
        return this;
    }
    public String getAppRegInfo() {
        return this.appRegInfo;
    }

    public UpdateAppMetaRequest setAppTag(java.util.List<String> appTag) {
        this.appTag = appTag;
        return this;
    }
    public java.util.List<String> getAppTag() {
        return this.appTag;
    }

    public UpdateAppMetaRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppMetaRequest setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
        return this;
    }
    public String getApplicationLink() {
        return this.applicationLink;
    }

    public UpdateAppMetaRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpdateAppMetaRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateAppMetaRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateAppMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppMetaRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateAppMetaRequest setDeveloper(String developer) {
        this.developer = developer;
        return this;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public UpdateAppMetaRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public UpdateAppMetaRequest setExecuteFile(String executeFile) {
        this.executeFile = executeFile;
        return this;
    }
    public String getExecuteFile() {
        return this.executeFile;
    }

    public UpdateAppMetaRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateAppMetaRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateAppMetaRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

    public UpdateAppMetaRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public UpdateAppMetaRequest setIsFree(String isFree) {
        this.isFree = isFree;
        return this;
    }
    public String getIsFree() {
        return this.isFree;
    }

    public UpdateAppMetaRequest setLicenceType(String licenceType) {
        this.licenceType = licenceType;
        return this;
    }
    public String getLicenceType() {
        return this.licenceType;
    }

    public UpdateAppMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppMetaRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    public UpdateAppMetaRequest setPublishType(Integer publishType) {
        this.publishType = publishType;
        return this;
    }
    public Integer getPublishType() {
        return this.publishType;
    }

    public UpdateAppMetaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAppMetaRequest setSilenceFlag(Long silenceFlag) {
        this.silenceFlag = silenceFlag;
        return this;
    }
    public Long getSilenceFlag() {
        return this.silenceFlag;
    }

    public UpdateAppMetaRequest setSilenceParam(String silenceParam) {
        this.silenceParam = silenceParam;
        return this;
    }
    public String getSilenceParam() {
        return this.silenceParam;
    }

    public UpdateAppMetaRequest setWamFileName(String wamFileName) {
        this.wamFileName = wamFileName;
        return this;
    }
    public String getWamFileName() {
        return this.wamFileName;
    }

    public UpdateAppMetaRequest setWamFilePath(String wamFilePath) {
        this.wamFilePath = wamFilePath;
        return this;
    }
    public String getWamFilePath() {
        return this.wamFilePath;
    }

    public UpdateAppMetaRequest setWamFileRealName(String wamFileRealName) {
        this.wamFileRealName = wamFileRealName;
        return this;
    }
    public String getWamFileRealName() {
        return this.wamFileRealName;
    }

}
