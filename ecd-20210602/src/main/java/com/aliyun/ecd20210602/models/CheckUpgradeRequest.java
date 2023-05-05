// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CheckUpgradeRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppVersionCode")
    public String appVersionCode;

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

    public static CheckUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeRequest self = new CheckUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CheckUpgradeRequest setAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
        return this;
    }
    public String getAppVersionCode() {
        return this.appVersionCode;
    }

    public CheckUpgradeRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CheckUpgradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckUpgradeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CheckUpgradeRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public CheckUpgradeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CheckUpgradeRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
