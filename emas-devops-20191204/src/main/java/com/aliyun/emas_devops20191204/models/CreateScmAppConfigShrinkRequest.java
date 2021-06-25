// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateScmAppConfigShrinkRequest extends TeaModel {
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

    @NameInMap("ContextUserUpdateRequest")
    public String contextUserUpdateRequestShrink;

    @NameInMap("RepoType")
    public String repoType;

    @NameInMap("Namespace")
    public String namespace;

    public static CreateScmAppConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScmAppConfigShrinkRequest self = new CreateScmAppConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScmAppConfigShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateScmAppConfigShrinkRequest setScmAddr(String scmAddr) {
        this.scmAddr = scmAddr;
        return this;
    }
    public String getScmAddr() {
        return this.scmAddr;
    }

    public CreateScmAppConfigShrinkRequest setScmAccessBid(String scmAccessBid) {
        this.scmAccessBid = scmAccessBid;
        return this;
    }
    public String getScmAccessBid() {
        return this.scmAccessBid;
    }

    public CreateScmAppConfigShrinkRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateScmAppConfigShrinkRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreateScmAppConfigShrinkRequest setContextUserUpdateRequestShrink(String contextUserUpdateRequestShrink) {
        this.contextUserUpdateRequestShrink = contextUserUpdateRequestShrink;
        return this;
    }
    public String getContextUserUpdateRequestShrink() {
        return this.contextUserUpdateRequestShrink;
    }

    public CreateScmAppConfigShrinkRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateScmAppConfigShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
