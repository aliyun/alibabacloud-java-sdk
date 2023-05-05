// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeAppDownloadInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppMode")
    public Long appMode;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppVersionCode")
    public Long appVersionCode;

    @NameInMap("Channel")
    public String channel;

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

    public static DescribeAppDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDownloadInfoRequest self = new DescribeAppDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppDownloadInfoRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppDownloadInfoRequest setAppMode(Long appMode) {
        this.appMode = appMode;
        return this;
    }
    public Long getAppMode() {
        return this.appMode;
    }

    public DescribeAppDownloadInfoRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DescribeAppDownloadInfoRequest setAppVersionCode(Long appVersionCode) {
        this.appVersionCode = appVersionCode;
        return this;
    }
    public Long getAppVersionCode() {
        return this.appVersionCode;
    }

    public DescribeAppDownloadInfoRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DescribeAppDownloadInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAppDownloadInfoRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeAppDownloadInfoRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeAppDownloadInfoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAppDownloadInfoRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
