// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ApplyStsTokenRequest extends TeaModel {
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

    public static ApplyStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyStsTokenRequest self = new ApplyStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyStsTokenRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ApplyStsTokenRequest setAppVersionCode(Long appVersionCode) {
        this.appVersionCode = appVersionCode;
        return this;
    }
    public Long getAppVersionCode() {
        return this.appVersionCode;
    }

    public ApplyStsTokenRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ApplyStsTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyStsTokenRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ApplyStsTokenRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ApplyStsTokenRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ApplyStsTokenRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
