// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectorySAMLServiceProviderInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4632107D-BCE1-5A96-B30B-182EE0709625</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SP.</p>
     */
    @NameInMap("SAMLServiceProvider")
    public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider SAMLServiceProvider;

    public static GetDirectorySAMLServiceProviderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySAMLServiceProviderInfoResponseBody self = new GetDirectorySAMLServiceProviderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectorySAMLServiceProviderInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDirectorySAMLServiceProviderInfoResponseBody setSAMLServiceProvider(GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider SAMLServiceProvider) {
        this.SAMLServiceProvider = SAMLServiceProvider;
        return this;
    }
    public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider getSAMLServiceProvider() {
        return this.SAMLServiceProvider;
    }

    public static class GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider extends TeaModel {
        /**
         * <p>The Assertion Consumer Service (ACS) URL of the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-shanghai.alibabacloudsso.com/saml/acs/51d298a9-2a3f-4e23-97c7-7ad1cfa9">https://signin-cn-shanghai.alibabacloudsso.com/saml/acs/51d298a9-2a3f-4e23-97c7-7ad1cfa9</a>****</p>
         */
        @NameInMap("AcsUrl")
        public String acsUrl;

        /**
         * <p>The signature algorithm supported by the AuthNRequest initiated by Alibaba Cloud. Value:</p>
         * <ul>
         * <li><p>rsa-sha256</p>
         * </li>
         * <li><p>rsa-sha1</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rsa-sha256</p>
         */
        @NameInMap("AuthnSignAlgo")
        public String authnSignAlgo;

        /**
         * <p>The certificate type used by Alibaba Cloud for signing during the SSO process. Value:</p>
         * <ul>
         * <li><p>self-signed: Use a self-signed certificate.</p>
         * </li>
         * <li><p>public: Use a certificate issued by CA.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The metadata file of the SP. The value of this parameter is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVyc2lv****</p>
         */
        @NameInMap("EncodedMetadataDocument")
        public String encodedMetadataDocument;

        /**
         * <p>The entity ID of the SP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-shanghai.alibabacloudsso.com/saml/sp/d-00fc2p61">https://signin-cn-shanghai.alibabacloudsso.com/saml/sp/d-00fc2p61</a>****</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>Whether to support Assertion encryption on the IdP side.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEncryptedAssertion")
        public Boolean supportEncryptedAssertion;

        public static GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider build(java.util.Map<String, ?> map) throws Exception {
            GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider self = new GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider();
            return TeaModel.build(map, self);
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setAcsUrl(String acsUrl) {
            this.acsUrl = acsUrl;
            return this;
        }
        public String getAcsUrl() {
            return this.acsUrl;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setAuthnSignAlgo(String authnSignAlgo) {
            this.authnSignAlgo = authnSignAlgo;
            return this;
        }
        public String getAuthnSignAlgo() {
            return this.authnSignAlgo;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setEncodedMetadataDocument(String encodedMetadataDocument) {
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }
        public String getEncodedMetadataDocument() {
            return this.encodedMetadataDocument;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setSupportEncryptedAssertion(Boolean supportEncryptedAssertion) {
            this.supportEncryptedAssertion = supportEncryptedAssertion;
            return this;
        }
        public Boolean getSupportEncryptedAssertion() {
            return this.supportEncryptedAssertion;
        }

    }

}
