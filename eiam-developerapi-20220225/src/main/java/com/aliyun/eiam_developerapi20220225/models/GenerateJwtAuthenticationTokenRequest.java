// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateJwtAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("audiences")
    public java.util.List<String> audiences;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("credentialProviderIdentifier")
    public String credentialProviderIdentifier;

    @NameInMap("customClaims")
    public java.util.Map<String, ?> customClaims;

    /**
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("expiration")
    public Integer expiration;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeDerivedShortToken")
    public Boolean includeDerivedShortToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://test.issuer.com">https://test.issuer.com</a></p>
     */
    @NameInMap("issuer")
    public String issuer;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_jwt_subject</p>
     */
    @NameInMap("subject")
    public String subject;

    public static GenerateJwtAuthenticationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateJwtAuthenticationTokenRequest self = new GenerateJwtAuthenticationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateJwtAuthenticationTokenRequest setAudiences(java.util.List<String> audiences) {
        this.audiences = audiences;
        return this;
    }
    public java.util.List<String> getAudiences() {
        return this.audiences;
    }

    public GenerateJwtAuthenticationTokenRequest setCredentialProviderIdentifier(String credentialProviderIdentifier) {
        this.credentialProviderIdentifier = credentialProviderIdentifier;
        return this;
    }
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    public GenerateJwtAuthenticationTokenRequest setCustomClaims(java.util.Map<String, ?> customClaims) {
        this.customClaims = customClaims;
        return this;
    }
    public java.util.Map<String, ?> getCustomClaims() {
        return this.customClaims;
    }

    public GenerateJwtAuthenticationTokenRequest setExpiration(Integer expiration) {
        this.expiration = expiration;
        return this;
    }
    public Integer getExpiration() {
        return this.expiration;
    }

    public GenerateJwtAuthenticationTokenRequest setIncludeDerivedShortToken(Boolean includeDerivedShortToken) {
        this.includeDerivedShortToken = includeDerivedShortToken;
        return this;
    }
    public Boolean getIncludeDerivedShortToken() {
        return this.includeDerivedShortToken;
    }

    public GenerateJwtAuthenticationTokenRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public GenerateJwtAuthenticationTokenRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
