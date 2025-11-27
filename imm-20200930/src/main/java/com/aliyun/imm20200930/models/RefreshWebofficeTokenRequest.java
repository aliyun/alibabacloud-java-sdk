// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenRequest extends TeaModel {
    /**
     * <p>Weboffice access token. Obtain it through the <a href="https://help.aliyun.com/document_detail/478226.html">GenerateWebofficeToken</a> or <a href="https://help.aliyun.com/document_detail/478227.html">RefreshWebofficeToken</a> interfaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99d1b8b478b641c1b3372f5bd6********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p><strong>If there are no special requirements, leave it blank.</strong></p>
     * <p>Chained authorization configuration, optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Access Other Entity Resources Using Chained Authorization</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>Project name. For more information on how to obtain it, see <a href="https://help.aliyun.com/document_detail/478153.html">Create Project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Weboffice refresh token. Obtain it through the <a href="https://help.aliyun.com/document_detail/478226.html">GenerateWebofficeToken</a> or <a href="https://help.aliyun.com/document_detail/478227.html">RefreshWebofficeToken</a> interfaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a730ae0d7c6a487d87c661d199********</p>
     */
    @NameInMap("RefreshToken")
    public String refreshToken;

    public static RefreshWebofficeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenRequest self = new RefreshWebofficeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshWebofficeTokenRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public RefreshWebofficeTokenRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RefreshWebofficeTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
