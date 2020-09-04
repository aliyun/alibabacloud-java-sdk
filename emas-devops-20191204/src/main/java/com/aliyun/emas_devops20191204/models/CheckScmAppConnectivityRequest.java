// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CheckScmAppConnectivityRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("ScmAddr")
    @Validation(required = true)
    public String scmAddr;

    @NameInMap("ScmAccessBid")
    @Validation(required = true)
    public String scmAccessBid;

    @NameInMap("Branch")
    @Validation(required = true)
    public String branch;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    public static CheckScmAppConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckScmAppConnectivityRequest self = new CheckScmAppConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public CheckScmAppConnectivityRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CheckScmAppConnectivityRequest setScmAddr(String scmAddr) {
        this.scmAddr = scmAddr;
        return this;
    }
    public String getScmAddr() {
        return this.scmAddr;
    }

    public CheckScmAppConnectivityRequest setScmAccessBid(String scmAccessBid) {
        this.scmAccessBid = scmAccessBid;
        return this;
    }
    public String getScmAccessBid() {
        return this.scmAccessBid;
    }

    public CheckScmAppConnectivityRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CheckScmAppConnectivityRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

}
