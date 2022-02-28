// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckUpdateRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("CurrentVersion")
    public String currentVersion;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUpdateRequest self = new CheckUpdateRequest();
        return TeaModel.build(map, self);
    }

    public CheckUpdateRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CheckUpdateRequest setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public CheckUpdateRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CheckUpdateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
