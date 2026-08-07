// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GenerateAuthCodeRequest extends TeaModel {
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
    public GenerateAuthCodeRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/oauth/callback">https://example.com/oauth/callback</a></p>
     */
    @NameInMap("ValidRedirectUri")
    public String validRedirectUri;

    public static GenerateAuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthCodeRequest self = new GenerateAuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAuthCodeRequest setBucAppName(String bucAppName) {
        this.bucAppName = bucAppName;
        return this;
    }
    public String getBucAppName() {
        return this.bucAppName;
    }

    public GenerateAuthCodeRequest setSsoTicket(String ssoTicket) {
        this.ssoTicket = ssoTicket;
        return this;
    }
    public String getSsoTicket() {
        return this.ssoTicket;
    }

    public GenerateAuthCodeRequest setTenantContext(GenerateAuthCodeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GenerateAuthCodeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GenerateAuthCodeRequest setValidRedirectUri(String validRedirectUri) {
        this.validRedirectUri = validRedirectUri;
        return this;
    }
    public String getValidRedirectUri() {
        return this.validRedirectUri;
    }

    public static class GenerateAuthCodeRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GenerateAuthCodeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GenerateAuthCodeRequestTenantContext self = new GenerateAuthCodeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GenerateAuthCodeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
