// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLIdentityProviderConfiguration")
    public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration;

    public static GetExternalSAMLIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExternalSAMLIdentityProviderResponseBody self = new GetExternalSAMLIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExternalSAMLIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExternalSAMLIdentityProviderResponseBody setSAMLIdentityProviderConfiguration(GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration) {
        this.SAMLIdentityProviderConfiguration = SAMLIdentityProviderConfiguration;
        return this;
    }
    public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration getSAMLIdentityProviderConfiguration() {
        return this.SAMLIdentityProviderConfiguration;
    }

    public static class GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration extends TeaModel {
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

        public static GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration self = new GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setCertificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public java.util.List<String> getCertificateIds() {
            return this.certificateIds;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setEncodedMetadataDocument(String encodedMetadataDocument) {
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }
        public String getEncodedMetadataDocument() {
            return this.encodedMetadataDocument;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setSSOStatus(String SSOStatus) {
            this.SSOStatus = SSOStatus;
            return this;
        }
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setWantRequestSigned(Boolean wantRequestSigned) {
            this.wantRequestSigned = wantRequestSigned;
            return this;
        }
        public Boolean getWantRequestSigned() {
            return this.wantRequestSigned;
        }

    }

}
