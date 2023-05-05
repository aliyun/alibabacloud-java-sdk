// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AutoInstallAppShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("Language")
    public String language;

    @NameInMap("SilenceInfo")
    public String silenceInfoShrink;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UserList")
    public String userListShrink;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static AutoInstallAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AutoInstallAppShrinkRequest self = new AutoInstallAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AutoInstallAppShrinkRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public AutoInstallAppShrinkRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public AutoInstallAppShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AutoInstallAppShrinkRequest setSilenceInfoShrink(String silenceInfoShrink) {
        this.silenceInfoShrink = silenceInfoShrink;
        return this;
    }
    public String getSilenceInfoShrink() {
        return this.silenceInfoShrink;
    }

    public AutoInstallAppShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AutoInstallAppShrinkRequest setUserListShrink(String userListShrink) {
        this.userListShrink = userListShrink;
        return this;
    }
    public String getUserListShrink() {
        return this.userListShrink;
    }

    public AutoInstallAppShrinkRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public AutoInstallAppShrinkRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
