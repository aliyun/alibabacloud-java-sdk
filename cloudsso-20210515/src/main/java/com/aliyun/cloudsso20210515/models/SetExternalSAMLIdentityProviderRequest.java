// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetExternalSAMLIdentityProviderRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EncodedMetadataDocument")
    public String encodedMetadataDocument;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("LoginUrl")
    public String loginUrl;

    @NameInMap("SSOStatus")
    public String SSOStatus;

    @NameInMap("WantRequestSigned")
    public Boolean wantRequestSigned;

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
