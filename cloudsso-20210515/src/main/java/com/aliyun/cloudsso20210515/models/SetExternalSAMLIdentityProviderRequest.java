// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetExternalSAMLIdentityProviderRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The metadata file of the IdP. The value of this parameter is Base64-encoded.</p>
     * <br>
     * <p>The file is provided by the IdP that supports SAML 2.0.</p>
     */
    @NameInMap("EncodedMetadataDocument")
    public String encodedMetadataDocument;

    /**
     * <p>The entity ID of the IdP.</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The logon URL of the IdP.</p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The status of SSO logon. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled (default)</p>
     */
    @NameInMap("SSOStatus")
    public String SSOStatus;

    /**
     * <p>Specifies whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:</p>
     * <br>
     * <p>*   true: yes</p>
     * <p>*   false: no (default)</p>
     */
    @NameInMap("WantRequestSigned")
    public Boolean wantRequestSigned;

    /**
     * <p>The X.509 certificate in the PEM format. If you specify this parameter, all existing certificates are replaced.</p>
     */
    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static SetExternalSAMLIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        SetExternalSAMLIdentityProviderRequest self = new SetExternalSAMLIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public SetExternalSAMLIdentityProviderRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetExternalSAMLIdentityProviderRequest setEncodedMetadataDocument(String encodedMetadataDocument) {
        this.encodedMetadataDocument = encodedMetadataDocument;
        return this;
    }
    public String getEncodedMetadataDocument() {
        return this.encodedMetadataDocument;
    }

    public SetExternalSAMLIdentityProviderRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SetExternalSAMLIdentityProviderRequest setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public SetExternalSAMLIdentityProviderRequest setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
        return this;
    }
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    public SetExternalSAMLIdentityProviderRequest setWantRequestSigned(Boolean wantRequestSigned) {
        this.wantRequestSigned = wantRequestSigned;
        return this;
    }
    public Boolean getWantRequestSigned() {
        return this.wantRequestSigned;
    }

    public SetExternalSAMLIdentityProviderRequest setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
