// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateOIDCProviderRequest extends TeaModel {
    /**
     * <p>The ID of the client, which is provided by the external IdP Okta. If you want to specify multiple client IDs, separate the client IDs with commas (,).</p>
     * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are <code>periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)</code>.``</p>
     * <p>The client ID can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>498469743454717****</p>
     */
    @NameInMap("ClientIds")
    public String clientIds;

    /**
     * <p>The description of the OIDC IdP.</p>
     * <p>The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an OIDC Provider.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The fingerprint of the HTTPS certificate, which is provided by the external IdP Okta. If you want to specify multiple fingerprints, separate the fingerprints with commas (,).</p>
     * <p>The fingerprint can contain letters and digits.</p>
     * <p>The fingerprint can be up to 40 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>902ef2deeb3c5b13ea4c3d5193629309e231****</p>
     */
    @NameInMap("Fingerprints")
    public String fingerprints;

    /**
     * <p>The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("IssuanceLimitTime")
    public Long issuanceLimitTime;

    /**
     * <p>The URL of the issuer, which is provided by the external IdP. The URL of the issuer must be unique within an Alibaba Cloud account.</p>
     * <p>The URL of the issuer must start with <code>https</code> and be in the valid URL format. The URL cannot contain query parameters that follow a question mark (<code>?</code>) or logon information that is identified by at signs (<code>@</code>). The URL cannot be a fragment URL that contains number signs (<code>#</code>).</p>
     * <p>The URL can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dev-xxxxxx.okta.com">https://dev-xxxxxx.okta.com</a></p>
     */
    @NameInMap("IssuerUrl")
    public String issuerUrl;

    /**
     * <p>The name of the OIDC IdP.</p>
     * <p>The name can contain letters, digits, and special characters and cannot start or end with the special characters. The special characters are <code>periods, (.), hyphens (-), and underscores (_)</code>.``</p>
     * <p>The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TestOIDCProvider</p>
     */
    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static CreateOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOIDCProviderRequest self = new CreateOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOIDCProviderRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public CreateOIDCProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOIDCProviderRequest setFingerprints(String fingerprints) {
        this.fingerprints = fingerprints;
        return this;
    }
    public String getFingerprints() {
        return this.fingerprints;
    }

    public CreateOIDCProviderRequest setIssuanceLimitTime(Long issuanceLimitTime) {
        this.issuanceLimitTime = issuanceLimitTime;
        return this;
    }
    public Long getIssuanceLimitTime() {
        return this.issuanceLimitTime;
    }

    public CreateOIDCProviderRequest setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
        return this;
    }
    public String getIssuerUrl() {
        return this.issuerUrl;
    }

    public CreateOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
