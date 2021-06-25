// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateScmAppConfigRequest extends TeaModel {
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
    public java.util.Map<String, ?> contextUserUpdateRequest;

    @NameInMap("RepoType")
    public String repoType;

    @NameInMap("Namespace")
    public String namespace;

    public static CreateScmAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScmAppConfigRequest self = new CreateScmAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateScmAppConfigRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateScmAppConfigRequest setScmAddr(String scmAddr) {
        this.scmAddr = scmAddr;
        return this;
    }
    public String getScmAddr() {
        return this.scmAddr;
    }

    public CreateScmAppConfigRequest setScmAccessBid(String scmAccessBid) {
        this.scmAccessBid = scmAccessBid;
        return this;
    }
    public String getScmAccessBid() {
        return this.scmAccessBid;
    }

    public CreateScmAppConfigRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateScmAppConfigRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreateScmAppConfigRequest setContextUserUpdateRequest(java.util.Map<String, ?> contextUserUpdateRequest) {
        this.contextUserUpdateRequest = contextUserUpdateRequest;
        return this;
    }
    public java.util.Map<String, ?> getContextUserUpdateRequest() {
        return this.contextUserUpdateRequest;
    }

    public CreateScmAppConfigRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateScmAppConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
