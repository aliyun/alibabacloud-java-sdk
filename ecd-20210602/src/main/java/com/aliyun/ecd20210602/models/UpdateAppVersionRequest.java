// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateAppVersionRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ApplicationLink")
    public String applicationLink;

    @NameInMap("ExecuteFile")
    public String executeFile;

    @NameInMap("ExecuteFileAddress")
    public String executeFileAddress;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("FileRealName")
    public String fileRealName;

    @NameInMap("Mock")
    public Boolean mock;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssAppUrl")
    public String ossAppUrl;

    @NameInMap("SilenceFlag")
    public Integer silenceFlag;

    @NameInMap("SilenceParam")
    public String silenceParam;

    @NameInMap("StartParam")
    public String startParam;

    @NameInMap("VersionId")
    public Long versionId;

    @NameInMap("WamFileName")
    public String wamFileName;

    @NameInMap("WamFilePath")
    public String wamFilePath;

    @NameInMap("WamFileRealName")
    public String wamFileRealName;

    public static UpdateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionRequest self = new UpdateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public UpdateAppVersionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppVersionRequest setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
        return this;
    }
    public String getApplicationLink() {
        return this.applicationLink;
    }

    public UpdateAppVersionRequest setExecuteFile(String executeFile) {
        this.executeFile = executeFile;
        return this;
    }
    public String getExecuteFile() {
        return this.executeFile;
    }

    public UpdateAppVersionRequest setExecuteFileAddress(String executeFileAddress) {
        this.executeFileAddress = executeFileAddress;
        return this;
    }
    public String getExecuteFileAddress() {
        return this.executeFileAddress;
    }

    public UpdateAppVersionRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateAppVersionRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateAppVersionRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

    public UpdateAppVersionRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

    public UpdateAppVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppVersionRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    public UpdateAppVersionRequest setSilenceFlag(Integer silenceFlag) {
        this.silenceFlag = silenceFlag;
        return this;
    }
    public Integer getSilenceFlag() {
        return this.silenceFlag;
    }

    public UpdateAppVersionRequest setSilenceParam(String silenceParam) {
        this.silenceParam = silenceParam;
        return this;
    }
    public String getSilenceParam() {
        return this.silenceParam;
    }

    public UpdateAppVersionRequest setStartParam(String startParam) {
        this.startParam = startParam;
        return this;
    }
    public String getStartParam() {
        return this.startParam;
    }

    public UpdateAppVersionRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public UpdateAppVersionRequest setWamFileName(String wamFileName) {
        this.wamFileName = wamFileName;
        return this;
    }
    public String getWamFileName() {
        return this.wamFileName;
    }

    public UpdateAppVersionRequest setWamFilePath(String wamFilePath) {
        this.wamFilePath = wamFilePath;
        return this;
    }
    public String getWamFilePath() {
        return this.wamFilePath;
    }

    public UpdateAppVersionRequest setWamFileRealName(String wamFileRealName) {
        this.wamFileRealName = wamFileRealName;
        return this;
    }
    public String getWamFileRealName() {
        return this.wamFileRealName;
    }

}
