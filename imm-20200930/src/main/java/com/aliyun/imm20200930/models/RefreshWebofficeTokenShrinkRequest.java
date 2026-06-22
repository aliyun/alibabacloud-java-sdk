// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenShrinkRequest extends TeaModel {
    /**
     * <p>The Weboffice access token. You can obtain the token by calling the <a href="https://help.aliyun.com/document_detail/478226.html">GenerateWebofficeToken</a> or <a href="https://help.aliyun.com/document_detail/478227.html">RefreshWebofficeToken</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99d1b8b478b641c1b3372f5bd6********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p><strong>Leave this parameter empty unless you have special requirements.</strong></p>
     * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The Weboffice refresh token. You can obtain the token by calling the <a href="https://help.aliyun.com/document_detail/478226.html">GenerateWebofficeToken</a> or <a href="https://help.aliyun.com/document_detail/478227.html">RefreshWebofficeToken</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a730ae0d7c6a487d87c661d199********</p>
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
