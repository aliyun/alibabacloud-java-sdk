// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLIdentityProviderConfiguration")
    public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration;

    public static SetExternalSAMLIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetExternalSAMLIdentityProviderResponseBody self = new SetExternalSAMLIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public SetExternalSAMLIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetExternalSAMLIdentityProviderResponseBody setSAMLIdentityProviderConfiguration(SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration) {
        this.SAMLIdentityProviderConfiguration = SAMLIdentityProviderConfiguration;
        return this;
    }
    public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration getSAMLIdentityProviderConfiguration() {
        return this.SAMLIdentityProviderConfiguration;
    }

    public static class SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration extends TeaModel {
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        @NameInMap("CreateTime")
        public String createTime;

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

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("WantRequestSigned")
        public Boolean wantRequestSigned;

        public static SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration self = new SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setCertificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public java.util.List<String> getCertificateIds() {
            return this.certificateIds;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setEncodedMetadataDocument(String encodedMetadataDocument) {
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }
        public String getEncodedMetadataDocument() {
            return this.encodedMetadataDocument;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setSSOStatus(String SSOStatus) {
            this.SSOStatus = SSOStatus;
            return this;
        }
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setWantRequestSigned(Boolean wantRequestSigned) {
            this.wantRequestSigned = wantRequestSigned;
            return this;
        }
        public Boolean getWantRequestSigned() {
            return this.wantRequestSigned;
        }

    }

}
