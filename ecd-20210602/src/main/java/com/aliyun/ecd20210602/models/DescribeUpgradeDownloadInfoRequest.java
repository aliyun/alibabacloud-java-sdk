// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeUpgradeDownloadInfoRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppVersionCode")
    public Integer appVersionCode;

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

    public static DescribeUpgradeDownloadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeDownloadInfoRequest self = new DescribeUpgradeDownloadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeDownloadInfoRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DescribeUpgradeDownloadInfoRequest setAppVersionCode(Integer appVersionCode) {
        this.appVersionCode = appVersionCode;
        return this;
    }
    public Integer getAppVersionCode() {
        return this.appVersionCode;
    }

    public DescribeUpgradeDownloadInfoRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DescribeUpgradeDownloadInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUpgradeDownloadInfoRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeUpgradeDownloadInfoRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeUpgradeDownloadInfoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeUpgradeDownloadInfoRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
