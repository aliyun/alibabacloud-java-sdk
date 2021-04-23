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

}
