// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateIsvAppRequest extends TeaModel {
    @NameInMap("AppDownloadUrl")
    public String appDownloadUrl;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ApplicationLink")
    public String applicationLink;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("CopyrightName")
    public String copyrightName;

    @NameInMap("CopyrightPath")
    public String copyrightPath;

    @NameInMap("CopyrightRealName")
    public String copyrightRealName;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("Developer")
    public String developer;

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

    @NameInMap("Name")
    public String name;

    @NameInMap("NewVersion")
    public String newVersion;

    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    @NameInMap("PublishType")
    public Integer publishType;

    @NameInMap("VersionId")
    public Integer versionId;

    public static UpdateIsvAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIsvAppRequest self = new UpdateIsvAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIsvAppRequest setAppDownloadUrl(String appDownloadUrl) {
        this.appDownloadUrl = appDownloadUrl;
        return this;
    }
    public String getAppDownloadUrl() {
        return this.appDownloadUrl;
    }

    public UpdateIsvAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateIsvAppRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateIsvAppRequest setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
        return this;
    }
    public String getApplicationLink() {
        return this.applicationLink;
    }

    public UpdateIsvAppRequest setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }
    public Integer getCateId() {
        return this.cateId;
    }

    public UpdateIsvAppRequest setCopyrightName(String copyrightName) {
        this.copyrightName = copyrightName;
        return this;
    }
    public String getCopyrightName() {
        return this.copyrightName;
    }

    public UpdateIsvAppRequest setCopyrightPath(String copyrightPath) {
        this.copyrightPath = copyrightPath;
        return this;
    }
    public String getCopyrightPath() {
        return this.copyrightPath;
    }

    public UpdateIsvAppRequest setCopyrightRealName(String copyrightRealName) {
        this.copyrightRealName = copyrightRealName;
        return this;
    }
    public String getCopyrightRealName() {
        return this.copyrightRealName;
    }

    public UpdateIsvAppRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateIsvAppRequest setDeveloper(String developer) {
        this.developer = developer;
        return this;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public UpdateIsvAppRequest setExecuteFile(String executeFile) {
        this.executeFile = executeFile;
        return this;
    }
    public String getExecuteFile() {
        return this.executeFile;
    }

    public UpdateIsvAppRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateIsvAppRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateIsvAppRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

    public UpdateIsvAppRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public UpdateIsvAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateIsvAppRequest setNewVersion(String newVersion) {
        this.newVersion = newVersion;
        return this;
    }
    public String getNewVersion() {
        return this.newVersion;
    }

    public UpdateIsvAppRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    public UpdateIsvAppRequest setPublishType(Integer publishType) {
        this.publishType = publishType;
        return this;
    }
    public Integer getPublishType() {
        return this.publishType;
    }

    public UpdateIsvAppRequest setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
