// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectorySAMLServiceProviderInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("AcsUrl")
        public String acsUrl;

        @NameInMap("AuthnSignAlgo")
        public String authnSignAlgo;

        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The metadata file of the SP. The value of this parameter is Base64-encoded.</p>
         */
        @NameInMap("EncodedMetadataDocument")
        public String encodedMetadataDocument;

        /**
         * <p>The entity ID of the SP.</p>
         */
        @NameInMap("EntityId")
        public String entityId;

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
