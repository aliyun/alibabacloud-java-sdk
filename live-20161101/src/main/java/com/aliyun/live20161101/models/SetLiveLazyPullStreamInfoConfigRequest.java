// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveLazyPullStreamInfoConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("PullDomainName")
    public String pullDomainName;

    @NameInMap("PullAppName")
    public String pullAppName;

    @NameInMap("PullProtocol")
    public String pullProtocol;

    @NameInMap("PullAuthType")
    public String pullAuthType;

    @NameInMap("PullAuthKey")
    public String pullAuthKey;

    @NameInMap("PullArgs")
    public String pullArgs;

    @NameInMap("LiveapiRequestFrom")
    public String liveapiRequestFrom;

    public static SetLiveLazyPullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveLazyPullStreamInfoConfigRequest self = new SetLiveLazyPullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveLazyPullStreamInfoConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullDomainName(String pullDomainName) {
        this.pullDomainName = pullDomainName;
        return this;
    }
    public String getPullDomainName() {
        return this.pullDomainName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullAppName(String pullAppName) {
        this.pullAppName = pullAppName;
        return this;
    }
    public String getPullAppName() {
        return this.pullAppName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullProtocol(String pullProtocol) {
        this.pullProtocol = pullProtocol;
        return this;
    }
    public String getPullProtocol() {
        return this.pullProtocol;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullAuthType(String pullAuthType) {
        this.pullAuthType = pullAuthType;
        return this;
    }
    public String getPullAuthType() {
        return this.pullAuthType;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullAuthKey(String pullAuthKey) {
        this.pullAuthKey = pullAuthKey;
        return this;
    }
    public String getPullAuthKey() {
        return this.pullAuthKey;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullArgs(String pullArgs) {
        this.pullArgs = pullArgs;
        return this;
    }
    public String getPullArgs() {
        return this.pullArgs;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setLiveapiRequestFrom(String liveapiRequestFrom) {
        this.liveapiRequestFrom = liveapiRequestFrom;
        return this;
    }
    public String getLiveapiRequestFrom() {
        return this.liveapiRequestFrom;
    }

}
