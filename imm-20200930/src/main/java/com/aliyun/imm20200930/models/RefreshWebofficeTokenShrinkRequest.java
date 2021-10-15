// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenShrinkRequest extends TeaModel {
    // access token
    @NameInMap("AccessToken")
    public String accessToken;

    // 链式授权
    @NameInMap("AssumeRoleChain")
    public String assumeRoleChainShrink;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // refresh token
    @NameInMap("RefreshToken")
    public String refreshToken;

    public static RefreshWebofficeTokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenShrinkRequest self = new RefreshWebofficeTokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenShrinkRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshWebofficeTokenShrinkRequest setAssumeRoleChainShrink(String assumeRoleChainShrink) {
        this.assumeRoleChainShrink = assumeRoleChainShrink;
        return this;
    }
    public String getAssumeRoleChainShrink() {
        return this.assumeRoleChainShrink;
    }

    public RefreshWebofficeTokenShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RefreshWebofficeTokenShrinkRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
