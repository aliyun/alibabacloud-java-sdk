// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the IdP.</p>
     */
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
        /**
         * <p>The ID of the SAML signing certificate.</p>
         */
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        /**
         * <p>The time when the IdP was configured for the first time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The metadata file of the IdP. The value of this parameter is Base64-encoded.</p>
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
         * <p>*   Disabled</p>
         */
        @NameInMap("SSOStatus")
        public String SSOStatus;

        /**
         * <p>The time when the IdP configurations were last modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Indicates whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no (default)</p>
         */
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
