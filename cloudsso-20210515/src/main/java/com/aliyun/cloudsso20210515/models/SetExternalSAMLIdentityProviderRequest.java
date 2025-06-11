// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetExternalSAMLIdentityProviderRequest extends TeaModel {
    /**
     * <p>The binding for sending SAML requests. Valid values:</p>
     * <ul>
     * <li>Post: HTTP Post bindings.</li>
     * <li>Redirect: HTTP Redirect bindings.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redirect</p>
     */
    @NameInMap("BindingType")
    public String bindingType;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The metadata file of the IdP. The value of this parameter is Base64-encoded.</p>
     * <p>The file is provided by the IdP that supports SAML 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>PD94bWwgdmVyc2lvbj0iMS4****</p>
     */
    @NameInMap("EncodedMetadataDocument")
    public String encodedMetadataDocument;

    /**
     * <p>The entity ID of the IdP.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.okta.com/exk3qwgtjhetR2Od">http://www.okta.com/exk3qwgtjhetR2Od</a>****</p>
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
     * <ul>
     * <li>Enabled</li>
     * <li>Disabled (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("SSOStatus")
    public String SSOStatus;

    /**
     * <p>Specifies whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WantRequestSigned")
    public Boolean wantRequestSigned;

    /**
     * <p>The X.509 certificate in the PEM format. If you specify this parameter, all existing certificates are replaced.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIC8DCCAdigAwIBAgIQP9eomUYGeoND****</p>
     */
    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static SetExternalSAMLIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        SetExternalSAMLIdentityProviderRequest self = new SetExternalSAMLIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public SetExternalSAMLIdentityProviderRequest setBindingType(String bindingType) {
        this.bindingType = bindingType;
        return this;
    }
    public String getBindingType() {
        return this.bindingType;
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
