// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
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

    public RefreshWebofficeTokenShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
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
