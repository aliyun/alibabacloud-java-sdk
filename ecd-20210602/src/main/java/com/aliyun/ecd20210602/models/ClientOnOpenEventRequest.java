// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ClientOnOpenEventRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AppVersion")
    public String appVersion;

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

    public static ClientOnOpenEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ClientOnOpenEventRequest self = new ClientOnOpenEventRequest();
        return TeaModel.build(map, self);
    }

    public ClientOnOpenEventRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public ClientOnOpenEventRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ClientOnOpenEventRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ClientOnOpenEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClientOnOpenEventRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ClientOnOpenEventRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ClientOnOpenEventRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ClientOnOpenEventRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
