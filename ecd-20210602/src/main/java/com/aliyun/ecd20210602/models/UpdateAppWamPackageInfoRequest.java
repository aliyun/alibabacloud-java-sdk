// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateAppWamPackageInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("Region")
    public String region;

    @NameInMap("SystemVersion")
    public String systemVersion;

    @NameInMap("WamFileName")
    public String wamFileName;

    @NameInMap("WamFilePath")
    public String wamFilePath;

    @NameInMap("WamFileRealName")
    public String wamFileRealName;

    @NameInMap("WamFileSize")
    public Integer wamFileSize;

    public static UpdateAppWamPackageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppWamPackageInfoRequest self = new UpdateAppWamPackageInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppWamPackageInfoRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public UpdateAppWamPackageInfoRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppWamPackageInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAppWamPackageInfoRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public UpdateAppWamPackageInfoRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UpdateAppWamPackageInfoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateAppWamPackageInfoRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

    public UpdateAppWamPackageInfoRequest setWamFileName(String wamFileName) {
        this.wamFileName = wamFileName;
        return this;
    }
    public String getWamFileName() {
        return this.wamFileName;
    }

    public UpdateAppWamPackageInfoRequest setWamFilePath(String wamFilePath) {
        this.wamFilePath = wamFilePath;
        return this;
    }
    public String getWamFilePath() {
        return this.wamFilePath;
    }

    public UpdateAppWamPackageInfoRequest setWamFileRealName(String wamFileRealName) {
        this.wamFileRealName = wamFileRealName;
        return this;
    }
    public String getWamFileRealName() {
        return this.wamFileRealName;
    }

    public UpdateAppWamPackageInfoRequest setWamFileSize(Integer wamFileSize) {
        this.wamFileSize = wamFileSize;
        return this;
    }
    public Integer getWamFileSize() {
        return this.wamFileSize;
    }

}
