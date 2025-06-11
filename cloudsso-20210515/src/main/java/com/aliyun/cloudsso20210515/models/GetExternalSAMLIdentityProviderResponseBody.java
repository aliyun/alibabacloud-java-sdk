// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96D1E5FF-0301-5636-8D33-071E033CFB82</p>
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
         * <p>The binding for sending SAML requests. Valid values:</p>
         * <ul>
         * <li>Post: HTTP Post bindings.</li>
         * <li>Redirect: HTTP Redirect bindings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Post</p>
         */
        @NameInMap("BindingType")
        public String bindingType;

        /**
         * <p>The SAML signing certificates.</p>
         */
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        /**
         * <p>The time when the IdP was configured for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-09T09:30:13Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

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
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVyc2lvbj0iMS4****</p>
         */
        @NameInMap("EncodedMetadataDocument")
        public String encodedMetadataDocument;

        /**
         * <p>The ID of the IdP.</p>
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
         * <p>Indicates whether SSO is enabled. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSOStatus")
        public String SSOStatus;

        /**
         * <p>The time when the IdP configurations were last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-09T09:30:22Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Indicates whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:</p>
         * <ul>
         * <li>true:</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WantRequestSigned")
        public Boolean wantRequestSigned;

        public static GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration self = new GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration();
            return TeaModel.build(map, self);
        }

        public GetExternalSAMLIdentityProviderResponseBodySAMLIdentityProviderConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
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
