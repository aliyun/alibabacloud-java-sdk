// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GenerateAuthCodeShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-qwenwork</p>
     */
    @NameInMap("BucAppName")
    public String bucAppName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>placeholder-sso-ticket</p>
     */
    @NameInMap("SsoTicket")
    public String ssoTicket;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/oauth/callback">https://example.com/oauth/callback</a></p>
     */
    @NameInMap("ValidRedirectUri")
    public String validRedirectUri;

    public static GenerateAuthCodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthCodeShrinkRequest self = new GenerateAuthCodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAuthCodeShrinkRequest setBucAppName(String bucAppName) {
        this.bucAppName = bucAppName;
        return this;
    }
    public String getBucAppName() {
        return this.bucAppName;
    }

    public GenerateAuthCodeShrinkRequest setSsoTicket(String ssoTicket) {
        this.ssoTicket = ssoTicket;
        return this;
    }
    public String getSsoTicket() {
        return this.ssoTicket;
    }

    public GenerateAuthCodeShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GenerateAuthCodeShrinkRequest setValidRedirectUri(String validRedirectUri) {
        this.validRedirectUri = validRedirectUri;
        return this;
    }
    public String getValidRedirectUri() {
        return this.validRedirectUri;
    }

}
