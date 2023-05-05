// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateAppVersionRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppVersionName")
    public String appVersionName;

    @NameInMap("CopyrightName")
    public String copyrightName;

    @NameInMap("CopyrightPath")
    public String copyrightPath;

    @NameInMap("CopyrightRealName")
    public String copyrightRealName;

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

    @NameInMap("WamFileName")
    public String wamFileName;

    @NameInMap("WamFilePath")
    public String wamFilePath;

    @NameInMap("WamFileRealName")
    public String wamFileRealName;

    public static CreateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionRequest self = new CreateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public CreateAppVersionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppVersionRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public CreateAppVersionRequest setCopyrightName(String copyrightName) {
        this.copyrightName = copyrightName;
        return this;
    }
    public String getCopyrightName() {
        return this.copyrightName;
    }

    public CreateAppVersionRequest setCopyrightPath(String copyrightPath) {
        this.copyrightPath = copyrightPath;
        return this;
    }
    public String getCopyrightPath() {
        return this.copyrightPath;
    }

    public CreateAppVersionRequest setCopyrightRealName(String copyrightRealName) {
        this.copyrightRealName = copyrightRealName;
        return this;
    }
    public String getCopyrightRealName() {
        return this.copyrightRealName;
    }

    public CreateAppVersionRequest setExecuteFile(String executeFile) {
        this.executeFile = executeFile;
        return this;
    }
    public String getExecuteFile() {
        return this.executeFile;
    }

    public CreateAppVersionRequest setExecuteFileAddress(String executeFileAddress) {
        this.executeFileAddress = executeFileAddress;
        return this;
    }
    public String getExecuteFileAddress() {
        return this.executeFileAddress;
    }

    public CreateAppVersionRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateAppVersionRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateAppVersionRequest setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
        return this;
    }
    public String getFileRealName() {
        return this.fileRealName;
    }

    public CreateAppVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppVersionRequest setOssAppUrl(String ossAppUrl) {
        this.ossAppUrl = ossAppUrl;
        return this;
    }
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    public CreateAppVersionRequest setSilenceFlag(Integer silenceFlag) {
        this.silenceFlag = silenceFlag;
        return this;
    }
    public Integer getSilenceFlag() {
        return this.silenceFlag;
    }

    public CreateAppVersionRequest setSilenceParam(String silenceParam) {
        this.silenceParam = silenceParam;
        return this;
    }
    public String getSilenceParam() {
        return this.silenceParam;
    }

    public CreateAppVersionRequest setStartParam(String startParam) {
        this.startParam = startParam;
        return this;
    }
    public String getStartParam() {
        return this.startParam;
    }

    public CreateAppVersionRequest setWamFileName(String wamFileName) {
        this.wamFileName = wamFileName;
        return this;
    }
    public String getWamFileName() {
        return this.wamFileName;
    }

    public CreateAppVersionRequest setWamFilePath(String wamFilePath) {
        this.wamFilePath = wamFilePath;
        return this;
    }
    public String getWamFilePath() {
        return this.wamFilePath;
    }

    public CreateAppVersionRequest setWamFileRealName(String wamFileRealName) {
        this.wamFileRealName = wamFileRealName;
        return this;
    }
    public String getWamFileRealName() {
        return this.wamFileRealName;
    }

}
